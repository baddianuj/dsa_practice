import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int len = arr.length;
        divide(arr, 0, len-1);
    }
    public static void divide(int arr[], int si, int ei){
        if(si>=ei) return;
       int mid = si+ (ei-si)/2;
       divide(arr,si,mid);
       divide(arr, mid+1, ei);
       conquer(arr, si, mid, ei);
    }
    public static void conquer(int[] arr, int start, int mid, int end){
        int merged[] = new int[end - start + 1];
        int idx1=start;
        int idx2=mid+1;
        int x=0;

        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1]<arr[idx2]){
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2<=end){
            merged[x++] = arr[idx2++];
        }

        for(int i=0,j=start; i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
