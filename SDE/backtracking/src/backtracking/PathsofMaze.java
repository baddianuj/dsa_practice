package backtracking;

import java.util.Arrays;

public class PathsofMaze    {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        obstacle("", 0,0,maze);

        int[][] arr = new int[maze.length][maze[0].length];
        Allpaths("", 0,0,maze, arr, 1);
    }
    public  static void obstacle(String p,int r, int c, boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) return;

        maze[r][c] = false;

        if(r<maze.length-1){
            obstacle(p+'D', r+1, c, maze);
        }
        if(c<maze[0].length-1){
            obstacle(p+'R', r, c+1, maze);
        }
        if(r>1){
            obstacle(p+'U', r-1, c ,maze);
        }
        if(c>1){
            obstacle(p+'U', r, c-1 ,maze);
        }

        maze[r][c] = true;
    }



    public  static void Allpaths(String p,int r, int c, boolean[][] maze, int[][] path, int steps){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c] = steps;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) return;
        path[r][c] = steps;
        maze[r][c] = false;

        if(r<maze.length-1){
            Allpaths(p+'D', r+1, c, maze, path, steps+1);
        }
        if(c<maze[0].length-1){
            Allpaths(p+'R', r, c+1, maze, path, steps+1);
        }
        if(r>1){
            Allpaths(p+'U', r-1, c ,maze, path, steps+1);
        }
        if(c>1){
            Allpaths(p+'U', r, c-1 ,maze, path, steps+1);
        }

        maze[r][c] = true;
        path[r][c]=0;
    }




}
