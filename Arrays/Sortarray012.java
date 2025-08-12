import java.util.*; 
public class Sortarray012 {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        System.out.println(
            Arrays.toString(sort(arr))
        );
    }
    public static int[] sort(int[] arr){
        

        // my approch using O(2N)

       int c0=0,c1=0,c2=0;
       for(int i=0; i<arr.length;i++){
        if(arr[i]==0) c0++;
        else if(arr[i]==1) c1++;
        else c2++;
       }
       int index=0;
       for(int i=index; i<c0; i++){
        arr[index] = 0;
        index++;
       }
       for(int i=index; i<c1+c0; i++){
        arr[index] = 1;
        index++;
       }
       for(int i=index; i<c2+c1+c0; i++){
        arr[index] = 2;
        index++;
       }
       
       return arr;
    }
}
