import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        strpermutations("", str);
    }   
     public static void strpermutations(String s, String up){
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        strpermutations(s+ch, up.substring(1));
        strpermutations(ch+s, up.substring(1));
     }
}
