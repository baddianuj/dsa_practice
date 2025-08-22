import java.util.*;

class LongSubArray {
    public static void main(String[] args) {
        int arr[] = {6, -2, 2, -8, 1, 7, 4, -10};
        int ans = longestSubarray0(arr);
        System.out.println(ans);
    }
    public static int longestSubarray0(int nums[]){

    //     brute force method takes O(n^2)
    //     int max=0;
    //    for(int i=0; i<nums.length; i++){
    //     int sum=0;
    //     for(int j=i; j<nums.length; j++){
    //         sum+=nums[j];
    //         if(sum==0){
    //            max = Math.max(max, j-i+1);
    //         }
    //     }
    //    }
    //    return max;

        int sum=0;
        int max=0;
        int k=0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum==k) max=i+1;
            if(!map.containsKey(sum)) map.put(sum, i);
            if(map.containsKey(sum-k)){
                int len = i - map.get(sum-k);
                max = Math.max(max, len);
            }

        }
        return max;


    }
}