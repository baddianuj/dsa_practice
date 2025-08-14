// import java.util.Arrays;

// public class Nextperm {
//     public static void main(String[] args) {
//         int arr[]  = { 3,2,5,7};
//         int len = arr.length;
//         int count =fact(len);
//         // int arr[] = {3,2};
//         nextPermutation(arr, len, count);
//         // System.out.println(Arrays.toString(arr));

//     }
//      public static void nextPermutation(int[] nums,int len,int count) {
//         if(count==0) return;
//         // int len = nums.length;
//         // find largest i such that ki-1 < ki
//         int i = -1;
//         for(int largi=len-1; largi>0;largi--){
//             if(nums[largi]>nums[largi-1]) {
//                 i=largi; 
//                 break;
//             }

//         }
//         if(i==-1){
//             reverse(nums, 0, len-1);
//             return;
//         }
//         // find largest j such that ki-1<kj
//         int j= -1;
//         for(int larj=len-1; larj>=0;larj--){
//             if(nums[larj]>nums[i-1]){ 
//                 j=larj;
//                 break;
//             }
//         }
//         swap(nums, i-1, j);
//         reverse(nums, i, len-1);
//         System.out.println(Arrays.toString(nums));
//         nextPermutation(nums, len, count-1);

//      }

//      public static void swap(int arr[], int fst, int sec){
//      int temp = arr[fst];
//      arr[fst] = arr[sec];
//      arr[sec] = temp;
//      }

//      public static void reverse(int arr[], int start, int end){
//         while(start<end){
//             swap(arr, start, end);
//             start++;
//             end--;
//         }
//      }
//      public static int fact(int n){
//         if(n==0 || n==1) return 1;
//         return n*fact(n-1);
//      }

// }



import java.util.Arrays;

public class Nextperm {
    public static void main(String[] args) {
        int arr[]  = {3, 2, 5, 7};
        int len = arr.length;
        int count = fact(len); // total permutations
        printAllPermutations(arr, len, count);
    }

    public static void printAllPermutations(int[] nums, int len, int count) {
        for (int k = 0; k < count; k++) {
            System.out.println(Arrays.toString(nums));
            nextPermutation(nums, len);
        }
    }

    public static void nextPermutation(int[] nums, int len) {
        // Step 1: find pivot
        int i = -1;
        for (int idx = len - 1; idx > 0; idx--) {
            if (nums[idx] > nums[idx - 1]) {
                i = idx;
                break;
            }
        }

        if (i == -1) { // last permutation → reverse to first
            reverse(nums, 0, len - 1);
            return;
        }

        // Step 2: find rightmost element > nums[i-1]
        int j = -1;
        for (int idx = len - 1; idx >= i; idx--) {
            if (nums[idx] > nums[i - 1]) {
                j = idx;
                break;
            }
        }

        // Step 3: swap pivot-1 and j
        swap(nums, i - 1, j);

        // Step 4: reverse suffix
        reverse(nums, i, len - 1);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }
}
