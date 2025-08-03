import java.util.*;

public class Movezeros {
    public static void moveZeroes(int[] nums) {

        //brute force
        
        int index = 0;
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                arr[index] = nums[i];
                index++;
            }
        }
        for(int i=index+1; i<nums.length; i++){
            arr[i] = 0;
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
