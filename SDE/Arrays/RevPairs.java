public class RevPairs {

    public static void main(String[] args) {
        int arr[] = {2,4,3,5,1};
        System.out.println(reversePairs(arr));
    }

    public static int reversePairs(int[] nums){
        int count=0;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int i=left;
            int j=right;
            while (i<j) {
                if(nums[i]==nums[j]){
                    i++;
                    j--;
                    continue;
                }
                else break;
            }
            if(i==j) count++;
            left++;
            right--;
        }
        System.out.println(left);
        System.out.println(right);
        return count;
    }
}