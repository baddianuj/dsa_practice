public class Naturalnos {
    public static void main(String[] args) {
        int n = 5;
        // print1(n);
        // print2(n,1);
        // System.out.println((sum(n)));
        System.out.println(factorial(n));
    }
    public static void print1(int n){
        if(n>0){
            System.out.println(n);
            print1(n-1);
        }
    }
    public static void print2(int n, int count){
        if(count>n){
            return;
        }
        System.out.println(count);
        print2(n, count+1);
    }
    public static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n * factorial(n-1);

    }
}
