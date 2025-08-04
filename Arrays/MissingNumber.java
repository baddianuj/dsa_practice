import java.util.HashSet;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            set.add(i);
        }
        for(int i=0; i<=nums.length; i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int  arr[] = {1,2,3,4,5,6,8,9};
        int ans = missingNumber(arr);;
        System.out.println(ans);
    }
}
