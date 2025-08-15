import java.util.*;


// find the duplicate numebr
public class DupliNum {

    public static int findDuplicate(int[] nums) {


        int slow=nums[0];
        int fast=nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow!=fast);
        fast = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;



        // Set<Integer> set = new HashSet<Integer>();
        // for(int i=0; i<nums.length; i++){
        //     if(set.contains(nums[i]))return nums[i];
        //     set.add(nums[i]);
        // }
        // return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,3};
        System.out.println(findDuplicate(arr));
    }
}
