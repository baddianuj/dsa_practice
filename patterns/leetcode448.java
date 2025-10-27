import java.util.*;

public class leetcode448 {

    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new ArrayList<Integer>();
        ans = findDisappearedNumbers(arr);
        System.out.println(ans);

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list  = new ArrayList<Integer>();
        for(int i=1; i<nums.length; i++){
            boolean found = false;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==i) found = true;
            }
            if(found==false) list.add(i);
        }
        return list;
    }
}