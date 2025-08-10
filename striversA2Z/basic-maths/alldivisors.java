import java.util.*;

public class alldivisors {
    public static void main(String[] args) {
        int num = 36;
        ArrayList<Integer> div = divisor(num);
        for(int i:div){
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> divisor(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sqrt = (int) Math.sqrt(num);
        for(int i=1; i<=sqrt; ++i){
            if(num%i==0){
                list.add(i);
            }
            if(i != num/i){
                list.add(num/i);
            }
        }
        return list;
    }
}
