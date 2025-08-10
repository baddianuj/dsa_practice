public class gcd {
    //euclidea approach
    public static void main(String[] args) {
        int a=20, b=15;
        System.out.println(findgcd(a,b));
    }
    public static int findgcd(int a, int b){
        while(a > 0 && b > 0){
            if (a>b) {
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if(a==0)return b;
        return a;
    }
}
