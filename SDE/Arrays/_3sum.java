import java.util.*;

public class _3sum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        System.out.println(threesum(arr, target));
    }

    public static List<List<Integer>> threesum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort first
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;        // Second pointer
            int right = n - 1;       // Third pointer

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    // Add the triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;  // We need a bigger sum
                } else {
                    right--; // We need a smaller sum
                }
            }
        }

        return result;
    }
}
