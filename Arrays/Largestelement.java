class Solution {
    public int largestElement(int[] nums) {
    int largest = 0;
    for(int i=0; i<nums.length-1;i++){
        if(nums[i]>largest) largest = nums[i];
    }
    return largest;
    }
}

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        int arr[] = {2,5,1,3,0};
        int ans = sol.largestElement(arr);
        System.out.println(ans);
    }
}