import java.util.Arrays;

public class binarysearch2d {
    public static void main(String[] args) {
        int arr[][] = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        int target = 19;
        System.out.println(Arrays.toString(search(arr, target)));
        
    }

    public static int[] search(int[][] matrix, int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if (rows==1) {
            return bisearch(matrix, 0, 0, cols-1, target);
        }

        int rstart=0;
        int rend=rows-1;
        int cmid = cols / 2;
        while (rstart < (rend-1)) {
            int mid = rstart + (rend-rstart)/2;
            if (matrix[mid][cmid]==target) {
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid]<target){
                rstart = mid;
            }
            else{
                rend = mid;
            }
        }

        if (matrix[rstart][cmid]==target) {
            return new int[] {rstart, cmid};

        }
        if(matrix[rstart+1][cmid]==target){
            return new int[] {rstart+1, cmid};
        }
        

        if (target <= matrix[rstart][cmid-1]) {
            return bisearch(matrix, rstart, 0, cmid-1, target);
        }
        if (target >= matrix[rstart][cmid+1] && target >= matrix[rstart][cols-1]) {
            return bisearch(matrix, rstart, cmid+1, cols-1, target);
        }
        if (target <= matrix[rstart+1][cmid-1]) {
            return bisearch(matrix, rstart+1, 0, cmid-1, target);
        }
        
        else{
            return bisearch(matrix, rstart+1, cmid+1, cols-1, target);
        }   



        
    }

    public static int[] bisearch(int[][] matrix, int row, int colstart, int colend, int target) {
        while (colstart<=colend) {
            int mid = colstart + (colend-colstart)/2;
            if (matrix[row][mid]==target) {
                return new int[]{colstart, mid};
            }
            if(matrix[row][mid]<target){
                colstart = mid + 1;
            }   
            else{
                colend = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    
    
}
