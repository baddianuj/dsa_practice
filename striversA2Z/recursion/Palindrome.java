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

    public static boolean checkforstring(String s,int left, int right){


        if(left>right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)) return false;

        return checkforstring(s,left+1,right-1);


        // traditional approach

        // int left = 0;
        // int right = s.length()-1;
        // while(left<right){
        //     if(s.charAt(left)!=s.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;
    }



    public static void main(String[] args) {
        int num=121;
        String s2 = String.valueOf(num);
        String s = "madam";
        System.out.println(checkforstring(s2, 0, s2.length()-1));    
        System.out.println(checkforstring(s,0,s.length()-1));
    }
}
