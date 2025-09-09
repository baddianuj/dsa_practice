public class noofzeros {
    public static void main(String[] args) {
        int num = 1002000000;
        System.out.println(zeros(num, 0));
    }
    public static int zeros(int num, int count){
        if(num%10==0) count++;
        if(num<10) return count;
        return zeros(num/10, count);
    }
}
