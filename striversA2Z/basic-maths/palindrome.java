public class palindrome {
    public static void main(String[] args) {
        int num = 453254;
        int num2 = check(num);
        if (num==num2) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
    public static int check(int num){
        int remainder;
        int reverse=0;
        while(num>0){
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;

        }
        return reverse;
    }
}
