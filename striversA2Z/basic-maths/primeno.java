public class primeno {
    public static boolean isprime(int num){
        if (num<=1) {
            return false;
        }
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 50;
        System.out.println(isprime(num));
    }
}
