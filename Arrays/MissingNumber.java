import java.util.HashSet;

public class MissingNumber {


 

    public static int missingNumber(int[] nums) {
               // better solution
        // HashSet<Integer> set = new HashSet<Integer>();
        // for(int i : nums){
        //     set.add(i);
        // }
        // for(int i=0; i<=nums.length; i++){
        //     if(!set.contains(i)) return i;
        // }
        // return -1;

                //brute
            // int i;
            // for (i=0; i<=nums.length; i++){
            //     int flag = 0;
            //     for(int j=0; j<nums.length; j++){
            //         if(nums[j]==i){
            //             flag = 1;
            //             break;
            //         }
            //     }
            //     if (flag==0) break;

            // }
            // return i;


                // optimal 1 = sum method
        int len = nums.length;
        int sum = (len * (len + 1) )/ 2;
        int total = 0;
        for(int i=0; i<len; i++){
            total+=nums[i];
        }
        return sum-total;

    }



    public static void main(String[] args) {
        int  arr[] = {0,1,2,3,4,5,6,8,9};
        int ans = missingNumber(arr);;
        System.out.println(ans);
    }
}
