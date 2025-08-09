import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {
        int i,j,temp;
        boolean swapped;
        
        int arr[] = {1,2,3,6,9,8,5,4,1,5,9};

        for(i=0; i<arr.length;i++){
            swapped =false;
            for(j=1;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(Arrays.toString(arr));
    }
 
    
    
}