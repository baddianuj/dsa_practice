import java.util.*;
public class _3sum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int target = 0;
        System.out.println(threesum(arr, target));
    }
    public static List<List<Integer>> threesum(int[] arr, int target){
        List<List<Integer>> list1 = new ArrayList<>();
        int len = arr.length;
        Arrays.sort(arr);
        for(int i=0; i<len-2;i++){
            if(arr[i]==arr[i+1]) continue;
            for(int j=i+1; j<len-1; j++){
                if(arr[j]==arr[j+1]) continue;
                for(int k=j+1; k<len; k++){
                    
                }
            }
        }
        return list1;
    }
}
