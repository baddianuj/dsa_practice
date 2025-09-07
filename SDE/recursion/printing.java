public class printing {

    public static void main(String[] args) {
        int x = 0;
        print(x);
    }
    public static void print(int num){
        if(num==10305){
            System.out.println(100);
            return;
        }
        System.out.println(num);
        print(num+1);
        return;
    }
}