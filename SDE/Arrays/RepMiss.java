import java.util.Arrays;
import java.util.HashSet;

public class RepMiss {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] ans = new int[2];
        int dup = -1;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(set.contains(nums[i])){
                dup  = nums[i];
                ans[0] = dup;
                break;
            }
            set.add(nums[i]);
        }

        
        int sum=0;
        for(int i=0; i<len;i++){
            sum+=nums[i];
        }
        sum = sum - dup;

        int total = (len*(len+1))/2;
        ans[1] = total - sum;
        System.out.println(total);
        System.out.println(sum);
        return ans;

    }
    
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 1};
        System.out.println(Arrays.toString(findMissingRepeatingNumbers(arr)));
    }

}