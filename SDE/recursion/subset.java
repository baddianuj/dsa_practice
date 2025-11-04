import java.lang.reflect.Array;
import java.util.*;

// permutations, combinations, subsets- non aligned collection

//pattern of taking some elements and removing some elements

public class subset {
    public static void main(String[] args) {
        // subsets("", "abc");

        // System.out.println(substring("", "abc"));

        int arr[] = {1,2,3};
        List<List<Integer>> ans = numbersubsets(arr);
        System.out.println(ans);
        
    }

    public static void subsets(String p, String up){
        if(up.isEmpty()){ 
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p+ch, up.substring(1));
        subsets(p, up.substring(1));
    }

    public static ArrayList<String> substring(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = substring(p+ch, up.substring(1));
        ArrayList<String> right = substring(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    public static List<List<Integer>> numbersubsets(int arr[]){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }

        }
        return outer;
    }
}
