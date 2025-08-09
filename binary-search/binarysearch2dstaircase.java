import java.util.*;

public class binarysearch2dstaircase {
    public static void main(String[] args) {

         int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 30;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
        
    }
    public static int[] searchMatrix(int[][] matrix, int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int potential_row = -1;
        
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return new int[] {-1,-1};
        }

        //binary seach on rows (first col)
        int start = 0;
        int end = rows-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[mid][0]==target) return new int[]{mid,0};
            if(matrix[mid][0]<target){
                start = mid + 1;
            } 
            else end = mid - 1;
        }
        potential_row=end;
        // System.out.println(Arrays.toString(matrix[potential_row]));
        
        // if(potential_row < 0) return new int[]{-1,-1};
        start = 0;
        end = cols-1;

        while (start<=end) {
            int mid = start + (end-start)/2;
            if(matrix[mid][potential_row]==target) return new int[] {potential_row, mid};
            if(matrix[mid][potential_row]<target) start = mid + 1;
            else end = mid - 1;
        }
        int potential_col = end;
        System.out.println(Arrays.toString(matrix[potential_col]));

        return new int[]{-1,-1};




    }

    
}
