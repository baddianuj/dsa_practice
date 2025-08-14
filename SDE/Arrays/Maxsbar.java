import java.util.ArrayList;
import java.util.Collections;

public class Maxsbar {
    public static int maxSubArray(int[] nums){
        // ArrayList<Integer> list = new ArrayList<Integer>(); //buffer limit

        // TLE 

        // int max = Integer.MIN_VALUE;
        // int len = nums.length;
        // for(int i=0; i<len; i++){
        //     int sum=0;
        //     for(int j=i; j<len; j++){
        //         sum+=nums[j];
        //         if(sum > max) max = sum;
                
        //     }
        // }
        // return max;

        int max = Integer.MIN_VALUE;
        int len = nums.length;
        int sum=0;
        for(int i=0; i<len; i++){
            sum+=nums[i];
            
            if(sum > max) max = sum;

            if(sum<0){
                sum=0;
            }
        }
        // if(max<0) return 0;
        return max;

        
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
