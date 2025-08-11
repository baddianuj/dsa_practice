import java.util.Arrays;

public class Qsort {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,8,2,9,5,7,0};
        int low = 0;
        int high = arr.length-1;
        quicksort(arr, low, high);
        System.out.println(Arrays.toString(arr));

    }
    public static void quicksort(int[] arr,int low, int high){
        if(low >= high) return;
        int pivot = pivotidx(arr, low, high);
        quicksort(arr,low,pivot-1);
        quicksort(arr, pivot+1, high);

    }

    public static int pivotidx(int arr[], int low, int high){
        int i=low;
        int j=high;
        int pivot = arr[low];
        while(i<j){
            while (arr[i]<=pivot && i<=high) {
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if (i<j) {
                swap(arr, i, j);
            }
            
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr, int one, int two) {
      int temp = arr[one];
      arr[one] = arr[two];
      arr[two] = temp;
   }
}

