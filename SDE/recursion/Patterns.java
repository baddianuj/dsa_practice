import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        // print(5);
        // print2(5, 1); // same as above 
        print3(5, 0);

    }

    public static void print(int n){
        if (n<=0) return;
        
        for(int i=0; i<n; i++){
            System.out.print(" * ");
        }
        System.out.println();
        print(n-1);
    }
    public static void print2(int row, int col){
        if(row<=0) return;
        print2(row-1, col+1);

        for(int i=0; i<col; i++){
            System.out.print(" $ ");
        }
        System.out.println();
    }
    public static void print3(int r, int c){
        if(r==0) return;
        if(c<r){
            System.out.print(" % ");
            print3(r, c+1);
        }
        else{
            System.out.println();
            print3(r-1, 0);
        }
        
    }
}
