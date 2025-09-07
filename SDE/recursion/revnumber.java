public class revnumber {
    public static void main(String[] args) {
        int num = 21345;
        System.out.println(reverse(num,0));
    }
    static int reverse(int num, int sum){
        if(num%10==num) return sum * 10 + num;
        int rem= num%10;
        sum = sum * 10 + rem;
        return reverse(num/10, sum);
    }
}
