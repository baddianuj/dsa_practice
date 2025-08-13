import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);
        System.out.println(ans);
        System.out.println(ncr(4-1, 3-1));
    //     int n = 4;
    //     generate(n);;
    }
    public static List<List<Integer>> generate(int num){
        List<List<Integer>> list = new ArrayList<>();
        
        int row = 0;
        int i;
        while(row<=num-1){
        List<Integer> second = new ArrayList<>();
        int arr[] = new int[row+1];
        int x = fact(row);
        for(i=0; i<row+1; i++){
            
            second.add(arr[i] = x/(fact(row-i)*fact(i)));
        }
        // for(int j=0; j<arr.length;j++){
            
        // }
        list.add(second);
        row++;
        }
        return list;

    }

    // public static void generate1(int num){
    //     int row = 0;
    //     while(row<=num){
    //     int arr[] = new int[row+1];
    //     int x = fact(row);
    //     for(int i=0; i<row+1; i++){
    //         arr[i] = x/(fact(row-i)*fact(i));
    //     }
    //     System.out.println(Arrays.toString(arr));
    //     row++;
    // }
    // }



    public static int fact(int n){
        if (n==0 || n==1) {
            return 1;
        }
        return n * fact(n-1);
    }

    public static long ncr(int n, int r){
        long res=1;
        for(int i=0; i<r;i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
}
