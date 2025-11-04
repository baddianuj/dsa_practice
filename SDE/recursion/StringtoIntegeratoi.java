import java.util.*;
public class StringtoIntegeratoi {
    public static void main(String[] args) {
        String str = "  47";
        System.out.println(myAtoi(str));
    }
    
    public static int myAtoi(String s) {
        
        return getnum(s, 1);

    }

    public static int getnum(String s, int num){
        if(s.isEmpty()) return num;
        char ch = s.charAt(0);
        if(ch==' ') return getnum(s.substring(1), num);
        if(!Character.isDigit(ch)){
            return getnum(s.substring(1), num * 10 + ch);
        }
        if(ch=='-') return -(num);

        return 0;
    }
}

// import java.util.*;

// public class StringtoIntegeratoi {
//     public static void main(String[] args) {
//         String str = "  -47abc";
//         System.out.println(myAtoi(str)); // Output: -47
//     }

//     public static int myAtoi(String s) {
//         if (s == null || s.isEmpty()) return 0;

//         int i = 0, sign = 1, result = 0;
//         int n = s.length();

//         // 1️⃣ Skip leading whitespaces
//         while (i < n && s.charAt(i) == ' ') i++;

//         // 2️⃣ Check for optional sign
//         if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
//             sign = (s.charAt(i) == '-') ? -1 : 1;
//             i++;
//         }

//         // 3️⃣ Convert digits to integer
//         while (i < n && Character.isDigit(s.charAt(i))) {
//             int digit = s.charAt(i) - '0';

//             // Optional: check for overflow
//             if (result > (Integer.MAX_VALUE - digit) / 10) {
//                 return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//             }

//             result = result * 10 + digit;
//             i++;
//         }

//         return result * sign;
//     }
// }
