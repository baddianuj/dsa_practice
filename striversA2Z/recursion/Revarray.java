import java.util.Arrays;

public class Revarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}        ;
        int left = 0;
        int right = arr.length-1;
        System.err.println(Arrays.toString(reverse(arr,left,right)) );
    }

    public static int[] reverse(int[] arr, int left, int right){
        if(left==right) return arr;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return reverse(arr, left+1, right-1);
    }
}
