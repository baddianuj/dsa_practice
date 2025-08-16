import java.util.*;
public class Power {
    public static void main(String[] args) {
        double x = 2;
        int n = -2000000;
        System.out.println(myPow(x, n));
    }
    public static double myPow(double x, int n){
        // return Math.pow(x, n);
        double val = x;
        if(n>0){
        for(int i=1; i<n; i++){
            x = x * val;
        }
    } else{
        for(int i=-1; i>n; i--){
            x = 1/(x*val);
        }
        
    }
        return x;
    }
}
