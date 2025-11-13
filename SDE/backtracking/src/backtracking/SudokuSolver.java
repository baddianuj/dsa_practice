package backtracking;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };


        solve(board);
        display(board);
//        System.out.println(solve(board));

    }


    public static boolean solve(int[][] board){
        int n = board.length;;
        int r = -1;
        int c = -1;
        boolean isempty = true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==0){
                    r = i;
                    c = j;
                    isempty = false;
                    break;
                }
            }
            if(isempty) break;;
        }

        if(isempty) return true;

        for (int i=1; i<=9; i++){
            if(isSafe(board,r,c,i)){
                board[r][c] = i;
                if(solve(board)){
//                    display(board);
                    return true;
                }
                else board[r][c] = 0;
            }
        }
        return false;
    }

    public static void display(int[][] board){
        for(int[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }



    public  static boolean isSafe(int[][] board, int r, int c, int num){
        if(board[r][c]==num) return false;
        for(int i=0 ; i<board.length; i++){
            if(board[i][c]==num || board[r][i]==num) return false;
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;

        for (int i = rowStart; i < rowStart+sqrt; i++) {
            for(int j = colStart; j<colStart+sqrt; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}
