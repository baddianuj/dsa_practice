import java.util.Arrays;

public class RotateMtx {
    public static void rotate(int[][] matrix){
        int len = matrix.length;
        // int temp[][] = new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<i; j++){
                swap(matrix, i, j);
            }
        }
        // System.out.println(Arrays.deepToString(matrix));
        for(int i=0; i<len; i++){
            reverse(matrix, 0, len-1, i);
        }
        // for(int i=0; i<len; i++){
        //     for(int j=0; j<len; j++){
        //         matrix[i][j] = temp[i][j];
        //     }
        // }
        
    }
    public static void reverse(int[][] arr, int start, int end, int row){
         while(start<end){
            int temp = arr[row][start];
            arr[row][start] = arr[row][end];
            arr[row][end] = temp;
            start++;
            end--;
         }
    }

    public static void swap(int[][] arr, int one, int two){
        int temp = arr[one][two];
        arr[one][two] = arr[two][one];
        arr[two][one] = temp;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {5,1,9,11},
            {2,4,8,10},
            {13,3,6,7},
            {15,14,12,16}
        };
        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
