import java.util.*;

class LongSubArray {
    public static void main(String[] args) {
        int arr[] = {9, -3, 3, -1, 6, -5};
        int ans = longestSubarray0(arr);
        System.out.println(ans);
    }
    public static int longestSubarray0(int nums[]){
    //    ArrayList<Integer> list = new ArrayList<Integer>();
        int count =0;
       for(int i=0; i<nums.length; i++){
        int sum=0;
        for(int j=i+1; j<nums.length; j++){
            sum+=nums[j];
            if(sum==0){
                count++;
            }
        }
       }
       return count;
    }
}