import java.util.*;
class SecondLargest{
    public static int secondLargest(int[] arr){

        //brute force Onlogn
        
        // Arrays.sort(arr);
        // int largest = arr[arr.length-1];
        // int seclargest = 0;
        // for(int i=arr.length-1; i>=0; i--){
        //     if(arr[i]<largest){ seclargest = arr[i]; break;}
        // }


        // optimal On

        int largest = arr[0];
        int seclargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                seclargest = largest;
                largest = arr[i];
            }
        }




        return seclargest;
    }


    public static void main (String argsp[]){
        int arr[] = {1,2,3,4,5,6};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
}
