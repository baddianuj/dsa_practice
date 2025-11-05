// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class PhoneCombo {
    // public List<String> letterCombinations(String digits) {
        
    // }
    public static void letterCombinations1(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        String str[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int num = up.charAt(0)-'0';
        
        String first = str[num];
        for(int i=0; i<first.length(); i++){
            char ch = first.charAt(i);
            letterCombinations1(p+ch, up.substring(1));
        }

    }
    public static List<String> helper(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        String str[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int num = up.charAt(0)-'0';
        
        List<String> ans = new ArrayList<>();
        String first = str[num];
        for(int i=0; i<first.length(); i++){
            char ch = first.charAt(i);
            ans.addAll(helper(p+ch, up.substring(1)));
        }
        return ans;
    }

    public static List<String> letterCombinations (String s){
        List<String> list = new ArrayList<>();
        list = helper("", s);
        return list;
    }



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = letterCombinations("", "23");
        System.out.println(list);
        
    }
    
}
