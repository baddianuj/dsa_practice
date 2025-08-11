import java.util.Arrays;

public class recBubble {
    public static void main(String[] args) {
        int arr[] = {1,6,9,5,3,4,8,1,7,0,2,3};
        Bsort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void Bsort(int arr[], int len){
        if(len==1){
            return;
        }
        for(int i=1; i<len; i++){
            if(arr[i] < arr[i - 1]){
                swap(arr, i, i-1);
            }
        }
        Bsort(arr, len-1);
    }
    public static void swap(int[] arr, int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
