import java.lang.classfile.constantpool.IntegerEntry;
import java.util.*;

public class removePara {

    public static String removeouterParantheses(String s){
        char[] arr = s.toCharArray();
        // List<Integer> list = new ArrayList<Integer>();
        Map<Character, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.remove(Integer.valueOf(7));
        System.out.println(list);
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(map);
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        
        String a = removeouterParantheses(s);
        System.out.println(a);
    }
}