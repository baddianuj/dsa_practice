//package backtracking;
//
//public class WordSearch79 {
//    public static void main(String[] args) {
//        char[][] arr = {
//                {'A','B','C','E'},
//                {'S','F','C','S'},
//                {'A','D','E','E'}
//        };
//
//        boolean[][] grid = new boolean[arr.length][arr[0].length];
//        System.out.println(exist(arr,"ABCCED",grid,0,0));
//
//    }
////needs fixing logic
//    public static boolean exist(char[][] board, String word, boolean[][] grid,int r, int c) {
//        if (r<0 || c<0 || r>=board.length || c>=board[0].length) return false;
//
//        if(word.isEmpty()){
//            return true;
//        }
//        if(!grid[r][c]) return false;
//
//        char ch = word.charAt(0);
//        if(board[r][c]!=ch){
//            if(r>0) return exist(board,word.substring(1),grid,r-1,c);
//            if(c>0) return exist(board,word.substring(1),grid,r,c-1);
//
//            if(r< grid.length-1) return exist(board,word.substring(1),grid,r+1,c);
//            if(c< grid[0].length-1) return exist(board,word.substring(1),grid,r,c+1);
//
//            return false;
//        }
//
//        grid[r][c]=false;
//        if(r>0) return exist(board,word.substring(1),grid,r-1,c);
//        if(c>0) return exist(board,word.substring(1),grid,r,c-1);
//
//        if(r< grid.length-1) return exist(board,word.substring(1),grid,r+1,c);
//        if(c< grid[0].length-1) return exist(board,word.substring(1),grid,r,c+1);
//        grid[r][c]=true;
//
//        return true;
//
//
//    }
//
//
//
//}



package backtracking;

public class WordSearch79 {
    public static void main(String[] args) {
        char[][] arr = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        boolean[][] grid = new boolean[arr.length][arr[0].length];
        System.out.println(exist1(arr, "ABCCED", grid, 0, 0));
    }

    public static boolean exist1(char[][] board, String word, boolean[][] grid, int r, int c) {
        // We’ll start by checking if the word exists from ANY starting point
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, grid)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int r, int c, boolean[][] grid) {
        // Base cases: out of bounds, already visited, or char mismatch
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length
                || grid[r][c] || board[r][c] != word.charAt(0)) {
            return false;
        }

        // If last character matched — word found
        if (word.length() == 1) {
            return true;
        }

        // Mark cell as visited
        grid[r][c] = true;

        // Explore 4 directions (up, down, left, right)
        boolean found =
                dfs(board, word.substring(1), r - 1, c, grid) || // up
                        dfs(board, word.substring(1), r + 1, c, grid) || // down
                        dfs(board, word.substring(1), r, c - 1, grid) || // left
                        dfs(board, word.substring(1), r, c + 1, grid);   // right

        // Unmark cell (backtrack)
        grid[r][c] = false;

        return found;
    }
}
