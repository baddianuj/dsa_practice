import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {5,1,4,3,2,0};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[], int start, int end){
        if(start==arr.length) return;
        // int min = start;
        // for(int i=start+1; i<=end; i++){
        //     if(arr[min]>arr[i]) min = i;
        // }
        int min = minidx(arr, start, end);

        swap(arr, min, start);
        sort(arr, start+1, end);
        
    }

    public static int minidx(int ar[], int st, int end){
        if(st >= end) return st;
        int min = end;
        if(ar[st]<ar[st+1]){
            return Math.min (min, minidx(ar, st+1, end));
        }
        return min;
    }


    public static void swap (int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
