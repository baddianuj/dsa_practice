import java.util.*;
public class Hashmap {
    // public static void main(String[] args) {
    //     String str = "apple";
    //     Map<Character, Integer> map = new HashMap<>();
        
    //     for(char ch : str.toCharArray()){
    //         map.put(ch, map.getOrDefault(ch, 0)+1);

    //     }
    //     System.out.println(map);
    // }



    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twosum(nums,17)));
        String s = "apple";
        // char[] arr = s.toCharArray();
        // System.out.println(Arrays.toString(arr));
    }
    public static int[] twosum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int compliment = target -nums[i];
            if(map.containsKey(compliment)) return new int[]{map.get(compliment),i};
            map.put(nums[i], i);
        }
        return new int[]{};


    }


    
}
