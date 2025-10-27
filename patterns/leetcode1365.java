import java.util.Arrays;

public class leetcode1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i]) count++;
            }
            arr[i] = count;
            count=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        arr = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(arr));
    }
}
