import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] arr,int k){

        // optimal  best so far

        int len = arr.length;
        k = k % len; // if k value is more than length of arr;
                    // multiple of len will always give you same array

        reverse(arr, 0, len-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, len-1);

    }

    public static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


        //brute solution Time limit execeded
        // while(k>0){
        //     int len = nums.length;
        //     int arr[] = new int[len];
        //     arr[0]=nums[len-1];
        //     for(int i=1; i<len; i++){
        //         arr[i] = nums[i-1];
        //     }
        //     for(int i=0; i<len;i++){
        //         nums[i] = arr[i];
        //     }
        //     k--;
        // }




        // just a better soln (took help)


        // int len = nums.length;
        // k = k % len;

        // int[] temp = new int[k];

        // // Step 1: Save last k elements
        // for (int i = 0; i < k; i++) {
        //     temp[i] = nums[len - k + i];
        // }

        // // Step 2: Shift the rest to the right
        // for (int i = len - 1; i >= k; i--) {
        //     nums[i] = nums[i - k];
        // }

        // // Step 3: Place saved elements in the front
        // for (int i = 0; i < k; i++) {
        //     nums[i] = temp[i];



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
