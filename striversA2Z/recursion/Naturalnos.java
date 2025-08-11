public class Naturalnos {
    public static void main(String[] args) {
        int n = 100;
        // print1(n);
        print2(n,1);
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
}
