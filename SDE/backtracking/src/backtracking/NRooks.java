package backtracking;

public class NRooks {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(rooks(board, 0));
    }
    public static int rooks(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int i = 0; i < board.length; i++) {
           if(isSafe(board, row, i)){
               board[row][i] = true;
               count+=rooks(board, row+1);
               board[row][i] = false;
           }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i=0; i<row; i++){
            if(board[i][col]) return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr : board){
            for(boolean element : arr){
                System.out.print(element ? "R " : "- ");
            }
        System.out.println();
        }
    }
}
