import java.util.*;
public class SortedArrayCheck {
    public static boolean isSorted(ArrayList<Integer> arr){
        for(int i=1; i<arr.size();i++){
            if(arr.get(i-1)>arr.get(i)) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int arr2[] = {1,2,3,3,3,4,5,6};
        for(int i=0; i<arr2.length-1;i++){
            int x = arr2[i];
            arr.add(x);
        }
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }
}
