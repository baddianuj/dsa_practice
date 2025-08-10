import java.util.*;
public class selection {
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,4,9,6};
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    public static int[] selectionsort(int[] arr){
        int len=arr.length;
        int min;
        for(int i=0; i<len-1;i++){
            min=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[min]) min=j;
            }
            swap(arr, min, i);
        }
        return arr;
    }
    public static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
    }

}
