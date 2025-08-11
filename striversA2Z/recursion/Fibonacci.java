public class Fibonacci {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(fib(num));
    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return n = fib(n-1) + fib(n-2);
    }
}
