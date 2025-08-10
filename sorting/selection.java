import java.util.*;
public class selection {
    public static void main(String[] args) {
        int arr[] = {1,3,5,8,4,9,6};

        int i,j,temp,minidx;
        for(i=0;i<arr.length-1;i++){
            minidx=i;

            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
