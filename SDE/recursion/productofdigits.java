public class productofdigits {
    public static void main(String[] args) {
           int num = 123456789;
           System.out.println(prod(num));
        
    }

    static int prod(int num){
        if(num%10==num) return num;
        return num%10 * prod(num/10);
    }
    
}
  