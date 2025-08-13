import java.util.*;

public class pasc2 {
    public static void main(String[] args) {
        int rows = 4;
        System.out.println(generate(rows));
        
    }
    public static List<List<Integer>> generate(int k){
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=k; i++){
            list.add(triangle(i));
        }
        return list;
    }
    
    public static List<Integer> triangle(int rows){
        List<Integer> retans = new ArrayList<>();
        int ans = 1;
        retans.add(ans);
        for(int col=1; col < rows; col++){
            ans = ans * (rows - col);
            ans = ans / col;
            retans.add(ans);
        }
        return retans;
    }
}
