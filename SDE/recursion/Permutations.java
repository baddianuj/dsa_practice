import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        strpermutations("", str);
        ArrayList<String> ans = new ArrayList<>();
        ans = strpermutationslist("", str);
        System.out.println(ans);
        
    }   
    public static void strpermutations(String s, String up){
       if(up.isEmpty()){
           System.out.println(s);
           return;
       }
    //    char ch = up.charAt(0);
    //    strpermutations(s+ch, up.substring(1));
    //    strpermutations(ch+s, up.substring(1));

        char ch = up.charAt(0);
        for(int i=0; i<=s.length(); i++){
             String l = s.substring(0, i);
             String r = s.substring(i);
             strpermutations(l+ch+r, up.substring(1));
        }       
    }
    public static ArrayList<String> strpermutationslist(String s, String up){
       if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(s);
            return ans;
       }
    
       ArrayList<String> list= new ArrayList<>();

        char ch = up.charAt(0);
        for(int i=0; i<=s.length(); i++){
             String l = s.substring(0, i);
             String r = s.substring(i,s.length());
            list.addAll(strpermutationslist(l+ch+r, up.substring(1)));
        }
        return list;       
    }
    
    
}
