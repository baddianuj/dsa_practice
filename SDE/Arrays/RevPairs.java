import java.util.*;

public class RevPairs {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1};
        System.out.println(reversePairs(arr)); // Expected: 2
        // System.out.println(Arrays.toString(arr)); // array is sorted after processing
    }

    public static int reversePairs(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        return divide(nums, 0, nums.length - 1);
    }

    // Split the array, count in left + right + cross, then merge
    private static int divide(int[] a, int si, int ei) {
        if (si >= ei) return 0;

        int mid = si + (ei - si) / 2;

        int count = 0;
        count += divide(a, si, mid);        // count in left half
        count += divide(a, mid + 1, ei);    // count in right half
        count += countPairs(a, si, mid, ei);// count cross pairs (left -> right)

        conquer(a, si, mid, ei);            // merge two sorted halves
        return count;
    }

    // Count cross reverse pairs where i in [si..mid], j in [mid+1..ei]
    private static int countPairs(int[] a, int si, int mid, int ei) {
        int count = 0;
        int j = mid + 1;

        for (int i = si; i <= mid; i++) {
            // move j while condition holds; j only moves forward
            while (j <= ei && (long) a[i] > 2L * a[j]) {
                j++;
            }
            // all indices in [mid+1 .. j-1] with current i are valid
            count += (j - (mid + 1));
        }
        return count;
    }

    // Standard merge step of merge sort
    private static void conquer(int[] a, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int i = si;         // pointer in left half
        int j = mid + 1;    // pointer in right half
        int x = 0;          // index in merged

        while (i <= mid && j <= ei) {
            if (a[i] <= a[j]) {
                merged[x++] = a[i++];
            } else {
                merged[x++] = a[j++];
            }
        }
        while (i <= mid) merged[x++] = a[i++];
        while (j <= ei)  merged[x++] = a[j++];

        // copy back
        for (int k = 0; k < merged.length; k++) {
            a[si + k] = merged[k];
        }
        System.out.println(Arrays.toString(a)); // debug: see array after each merge
    }
}
