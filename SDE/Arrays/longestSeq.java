import java.util.*;

public class longestSeq {
    public static void main(String[] args) {
        int arr[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        // System.out.println(Arrays.toString(longestConsecutive(arr)));
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums){


        //optimal soln usign hashsetllll

        if(nums.length == 0) return 0;
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        
        int longest = 0;
        
        for(int num : set){
            // check if it's sequence start
            if(!set.contains(num - 1)){
                int currNum = num;
                int currStreak = 1;
                
                while(set.contains(currNum + 1)){
                    currNum++;
                    currStreak++;
                }
                
                longest = Math.max(longest, currStreak);
            }
        }
        
        return longest;


        // kinda optimal solution 

        // TreeSet<Integer> treeset = new TreeSet<>();
        // for(int val: nums){
        //     treeset.add(val);
        // }
        // // Iterator<Integer> it = treeset.iterator();
        // // while(it.hasNext()){
        // //     it.next();
        // // }
        // System.out.println(treeset);
        // List<Integer> list = new ArrayList<Integer>(treeset);
        // int count= 1;
        // int max=0;
        // for(int i=1; i<list.size(); i++){
        //     if(list.get(i)==1+list.get(i-1)){
        //         count++;
        //     }
        //     else{
        //         max = Math.max(max, count);
        //         count=1;
        //     }
        // }
        
        // return Math.max(max, count);
    }
}
