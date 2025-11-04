import java.util.*;

// permutations, combinations, subsets- non aligned collection

//pattern of taking some elements and removing some elements

public class subset {
    public static void main(String[] args) {
        subsets("", "abc");
        
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
}
