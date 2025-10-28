import java.util.*;

public class subset {
    public static void main(String[] args) {
        String str = "aabbaba";
        str = removea(str);
        System.out.println(str);
    }
    
    public static String removea(String s){
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='a') list.add(s.charAt(i));
        }
        
        StringBuilder res = new StringBuilder();
        for(char c : list){
            res.append(c);
        }
        return res.toString();
    }+
}
