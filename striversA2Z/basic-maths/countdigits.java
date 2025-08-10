class countdigits{
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(digits(num));
    }
    public static int digits(int num){

        int cnt = (int) (Math.log10(num)+1);
        return cnt;







        // int count=0;
        // while (num>10) {
        //     num = num/10;
        //     count++;
        // }
        // count++;
        // return count;
    }
}