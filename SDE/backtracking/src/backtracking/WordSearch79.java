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
        if (r<0 || c<0 || r>=board.length || c>=board[0].length) return false;

        if(word.isEmpty()){
            return true;
        }
        if(!grid[r][c]) return false;

        char ch = word.charAt(0);
        if(board[r][c]!=ch){
            if(r>0) return exist(board,word.substring(1),grid,r-1,c);
            if(c>0) return exist(board,word.substring(1),grid,r,c-1);

            if(r< grid.length-1) return exist(board,word.substring(1),grid,r+1,c);
            if(c< grid[0].length-1) return exist(board,word.substring(1),grid,r,c+1);

            return false;
        }

        grid[r][c]=false;
        if(r>0) return exist(board,word.substring(1),grid,r-1,c);
        if(c>0) return exist(board,word.substring(1),grid,r,c-1);

        if(r< grid.length-1) return exist(board,word.substring(1),grid,r+1,c);
        if(c< grid[0].length-1) return exist(board,word.substring(1),grid,r,c+1);
        grid[r][c]=true;

        return true;


    }



}
