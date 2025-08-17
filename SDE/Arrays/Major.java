import java.util.*;

public class Major {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majority(arr));
    }
    public static int majority(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int len=nums.length;
        for(int i=0; i<len; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }   
        // System.out.println(map);
        int maxfreq = len/2;;
        int element = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxfreq){
                maxfreq = entry.getValue();
                element = entry.getKey();
                list.add(element);

                
            }
        }
        return element;
        // return 0;
        // return list;
    }
}
