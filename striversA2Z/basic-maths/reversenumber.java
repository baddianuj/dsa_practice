public class reversenumber {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }
    static int reverse(int n){
        int rev=0;
        int remainder;
        while(n>0){
            remainder = n % 10;
            rev = (rev*10)+remainder;
            n=n/10;
        }
        return rev;
    }
}
