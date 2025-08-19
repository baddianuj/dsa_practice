import java.util.*;

public class longestSeq {
    public static void main(String[] args) {
        int arr[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        // System.out.println(Arrays.toString(longestConsecutive(arr)));
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums){

        TreeSet<Integer> treeset = new TreeSet<>();
        for(int val: nums){
            treeset.add(val);
        }
        // Iterator<Integer> it = treeset.iterator();
        // while(it.hasNext()){
        //     it.next();
        // }
        System.out.println(treeset);
        List<Integer> list = new ArrayList<Integer>(treeset);
        int count= 1;
        int max=0;
        for(int i=1; i<list.size(); i++){
            if(list.get(i)==1+list.get(i-1)){
                count++;
            }
            else{
                max = Math.max(max, count);
                count=1;
            }
        }
        
        return Math.max(max, count);
    }
}
