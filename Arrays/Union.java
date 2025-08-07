import java.util.Arrays;

public class Union {
    public static int[] unionArray(int nums1[], int nums2[]){
        
        
        // this from my though process except of the Arrays.copyOf() approach
        
        
        // int len = nums1.length + nums2.length;
        // int nums3[] = new int[len];
        // System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        // System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        // Arrays.sort(nums3);
        // int index =1;
        // for(int i=1; i<nums3.length;i++){
        //     if(nums3[i]!=nums3[i-1]){
        //         nums3[index]=nums3[i];
        //         index++;
        //     }
        // }
        // return Arrays.copyOf(nums3, index);
        

    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,4,5};
        int nums2[] = {1,2,7};
        System.out.println(Arrays.toString(unionArray(nums1, nums2)));
    }

}
