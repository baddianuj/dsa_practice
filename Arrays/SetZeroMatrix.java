import java.util.*;

public class SetZeroMatrix {
    public static int[][] setZeros(int matrix[][]){
        int rowlen = matrix.length;
        int collen = matrix[0].length;

        //first pass
        // for(int i=0; i<rowlen; i++){
        //     for(int j=0;j<collen; j++){
        //         if (matrix[i][j]==0) {
        //             for(int row=0; row<rowlen; row++){
        //                 if(matrix[row][j]!=0)
        //                 matrix[row][j]=-1;
        //             }
        //             for(int col=0; col<collen; col++){
        //                 if(matrix[i][col]!=0)
        //                 matrix[i][col]=-1;
        //             }
        //         }
        //     }
        // }

        // for(int i=0;i<rowlen; i++){
        //     for(int j=0; j<collen; j++){
        //         if(matrix[i][j]==-1){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
        return matrix;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
        int arr2[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println(Arrays.deepToString(setZeros(arr)));
        System.out.println(Arrays.deepToString(setZeros(arr2)));
    }
    
}
