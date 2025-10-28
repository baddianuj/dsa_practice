import java.util.Arrays;

public class selectionsort {

    public static void main(String[] args) {
        // int arr[] = {3,4,6,9,7};
        int arr[] = {30, 1, 6, 1, 68, 12, 54, 74, 56, 30, 91, 4, 75, 90, 7, 62, 76, 17, 25, 47, 23, 52, 46, 16, 96, 63, 77, 16, 44, 48, 53, 24, 47, 12, 74, 21, 20, 92, 83, 97, 7, 88, 80, 12, 75, 5, 78, 5, 58, 51}; 
        
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[], int start, int end){
        if(end<start) return;
        int maxidx = max(arr, start, end);
        swap(arr, maxidx, end);
        sort(arr, start, end-1);
    }
    
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
    }

    public static int max(int arr[], int start, int end){
    if (start == end) return start;
    int maxidx = max(arr, start+1, end);
    return (arr[start] > arr[maxidx]) ? start : maxidx;
}

}