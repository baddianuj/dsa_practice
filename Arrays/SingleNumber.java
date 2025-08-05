public class SingleNumber {
    public static int singleNumber(int[] nums) {



            //brutee

        // for(int i=0; i<nums.length; i++){
        //     int count=1;
        //     int num = nums[i];
        //     for(int j=0; j<nums.length; j++){
        //         if(nums[j]==num && i!=j){count++;}
        //     }
        //     if (count==1) {
        //         return num;
        //     }

        // }
        // return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4};
        int ans = singleNumber(arr);
        System.out.println(ans);;
    }
}
