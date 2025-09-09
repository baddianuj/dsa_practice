import java.util.*;

public class pascal2 {

    public static void main(String[] args) {
        

    }
    public static List<Integer> row(int rowindex){
        List<Integer>  list = new ArrayList<>();
        for(int i=0; i<rowindex; i++){
            list.add((int)ncr(rowindex, i));
        }
        return list;

    }

    public static long  ncr(int n, int r){
        long res = 1;
        for(int i=0; i<r; i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
    
}
