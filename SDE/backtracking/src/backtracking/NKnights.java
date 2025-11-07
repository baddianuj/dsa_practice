package backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0));
    }

    public  static  int knights(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;

        }
        int count=0;
        for(int col=0; col< board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col]=true;
                count += knights(board, row+1);
                board[row][col]=false;
            }
        }
        return  count;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        //left-up
        if((isValid(board,row-1,col-2) && board[row-1][col-2])) return false;
        if((isValid(board,row-2,col-1) && board[row-2][col-1])) return false;

        //left-down
        if(isValid(board,row+1,col-2) && (board[row+1][col-2])) return false;
        if(isValid(board,row+2,col-1) && board[row+2][col-1]) return false;

        //right-up
        if(isValid(board,row-2,col+1) && board[row-2][col+1]) return false;
        if(isValid(board,row-1,col+2) && board[row-1][col+2]) return false;

        //right-down

        if(isValid(board,row+1,col+2) && board[row+1][col+2]) return false;
        if(isValid(board,row+2,col+1) && board[row+2][col+1]) return false;


        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr : board){
            for(boolean ele : arr){
                System.out.print(ele ? 'K' : '-');
            }
        System.out.println();
        }
    }

    public static boolean isValid(boolean[][] board, int row, int col){
        return row>=0 && col>=0 && row< board.length && col< board.length;
    }
}
