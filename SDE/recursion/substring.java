import java.util.*;

public class substring {
    public static void main(String[] args) {
        String str = "aa  bsfse  fbb xcsaaaaf cada";
        // str = removea(str);
        // System.out.println(str);
        String ans = "";
        System.out.println(removeA(str, ans));

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
    }

    public static String removeA(String s, String ans){
        if(s.isEmpty()) return ans;
        char ch = s.charAt(0);
        if(ch=='a' || ch==' '){
            return removeA(s.substring(1), ans);
        }
        else{
            return removeA(s.substring(1), ans + ch);
        }
    }
    
}
