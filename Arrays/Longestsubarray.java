import java.util.*;
public class Longestsubarray {
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9};
        // int arr[] = {-3,2,1};
        int target = 15;
        System.out.println(longest(arr, target));
    }
    public static int longest(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<Integer>();

        int maxlen=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==target){
                    maxlen = Math.max(maxlen, j-i+1);
                }
            }
            
        }
        return maxlen;

    }
}
