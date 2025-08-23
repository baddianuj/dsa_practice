import java.util.*;

public class _3sum {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        List<List<Integer>> ans = threeSum(arr, target);
        System.out.println(ans);
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        // Final result list to store all unique triplets
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array (important for duplicates + two-pointer logic)
        Arrays.sort(nums);

        // Step 2: Loop through each element (first number of the triplet)
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Step 3: Use two-pointer approach for the remaining two numbers
            int left = i + 1;              // Second number pointer
            int right = nums.length - 1;   // Third number pointer

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate numbers for the second number
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate numbers for the third number
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward after storing the triplet
                    left++;
                    right--;
                }
                else if (sum < target) {
                    // We need a bigger sum → move left pointer forward
                    left++;
                }
                else {
                    // We need a smaller sum → move right pointer backward
                    right--;
                }
            }
        }

        return result;
    }
}
