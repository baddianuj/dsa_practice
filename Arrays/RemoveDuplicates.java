public class RemoveDuplicates {
    public static int removeDuplicates(int nums[]){
        int index = 1;
        int len=nums.length;
        int i;
        for( i=1;i<len; i++ ){
            if (nums[i]!=nums[i-1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

    }
}
