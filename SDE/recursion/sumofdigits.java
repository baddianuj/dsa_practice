public class sumofdigits {
    public static void main(String[] args) {
           int num = 123456789;
           System.out.println(sum(num));
        
    }

    static int sum(int num){
        if(num==0) return 1;
        return num%10 * sum(num/10);
    }
    
}
