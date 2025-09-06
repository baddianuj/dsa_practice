public class singleele540 {
    public static  int singleNonDuplicate(int[] nums) {
        int start=0;
        int end = nums.length-1;
        int min=Integer.MIN_VALUE;
        while(start=<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>min) start=mid;
            else if (arr[mid]<min){
                min = arr[mid];
                end=mid;
            }
        }
        return min;
    }
    public static void main(String ar[]){
        int arr[] = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
}