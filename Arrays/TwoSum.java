import java.util.*;;

public class TwoSum {
     public static int[] twoSum(int[] nums, int target){
        int arr[] = {0,0};
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;

     }

     public static void main(String[] args) {
        
        int arr[] = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
     }
}
