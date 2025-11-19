package introduction.access;

public class Main {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s3 = new String("abc");

        if(s1==s3) System.out.println("equal");
        else System.out.println("not equal");
    }
}
