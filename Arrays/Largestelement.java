

public class Largestelement {

    //brute force O(n*Logn)

    // public static int largestElement(int[] nums){
    //     Arrays.sort(nums);
    //     return nums[nums.length-1];
    // }




    // better soln

    public static int largestElement(int[] nums) {
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest)
                largest = nums[i];
        }
        return largest;
    }



    public static void main(String args[]) {
        int arr[] = {2, 5, 1, 3, 0};
        int ans = largestElement(arr);
        System.out.println(ans);
    }
}
