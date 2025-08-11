import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(duplicates(arr));
    }

    public static boolean duplicates(int arr[]){
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if(!set.add(num)) return true;
        }
        return false;

    }
}
