package backtracking;

public class WordSearch79 {
    public static void main(String[] args) {
        char[][] arr = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        boolean[][] grid = new boolean[arr.length][arr[0].length];
        System.out.println(exist(arr,"ABCCED",grid,0,0));

    }
//needs fixing logic
    public static boolean exist(char[][] board, String word, boolean[][] grid,int r, int c) {
        if(word.isEmpty()){
            return true;
        }

        if(!grid[r][c]) return false;

        char ch = word.charAt(0);
        grid[r][c]= false;
        if(r<board.length-1 && ch==board[r][c]){
            exist(board,word.substring(1),grid,r+1, c);
        }if(c<board[0].length-1 && ch==board[r][c]){
            exist(board,word.substring(1),grid,r, c+1);
        }if(r>0 && ch==board[r][c]){
            exist(board,word.substring(1),grid,r-1, c);
        }if(c>0 && ch==board[r][c]){
            exist(board,word.substring(1),grid,r, c-1);
        }
        grid[r][c]=true;
        return true;
    }
}
