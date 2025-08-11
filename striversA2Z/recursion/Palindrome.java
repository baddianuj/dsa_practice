public class Palindrome {
    public static boolean checkfornum(int num){
        int original = num;
        int reversed = 0;
        while(num > 0){
            int remainder = num % 10;
            reversed = (reversed*10)+remainder;
            num = num / 10;
        }
        return original==reversed;
    }

    public static boolean checkforstring(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    public static void main(String[] args) {
        int num=121;
        String s = "madam";
        System.out.println(checkfornum(num));    
        System.out.println(checkforstring(s));
    }
}
