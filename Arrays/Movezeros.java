import java.util.*;

public class Movezeros {
    public static void moveZeroes(int[] nums) {

        //brute force

        int index = 0;
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                arr[index] = nums[i];
                index++;
            }
        }
        for(int i=index+1; i<nums.length; i++){
            arr[i] = 0;
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }



        //bit more optimal ig
        // int j=-1;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==0){
        //         j=i;
        //         break;
        //     }
        // }
        // for(int i=j+1; i<nums.length; i++){
        //     if(j==-1) break;
        //     if(nums[i]!=0){
        //         nums[j] = nums[i];
        //         nums[i] = 0;
        //         j++;
        //     }
        // }

    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}


// this the most optimal,  didnt understand shit
// class Solution {
//     static {
//         for (int i = 0; i < 100; i++) {
//             moveZeroes(new int[] { 0, 0 });
//         }
//     }
//     public static void moveZeroes(int[] arr) {
//        int z=0;
//        for(int i=0;i<arr.length;i++){
//             if(arr[i]!=0){
//                 int temp=arr[i];
//                 arr[i]=arr[z];
//                 arr[z]=temp;
//                 z++;
//             }
//        }
//     }
// }