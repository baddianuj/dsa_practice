import java.util.*;
public class MostCons1 {
    public static int mostconsective1s(int nums[]){
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // int count=0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i]==1) {
        //         count++;
        //     }
        //     else{
        //         arr.add(count);
        //         count=0;
        //     }
        // }
        // arr.add(count);
        // return Collections.max(arr);

        int max=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                max = Math.max(count, max);
            }
            else count=0;
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,1,0,0};
        int ans = mostconsective1s(arr);
        System.out.println(ans);
    }

}
