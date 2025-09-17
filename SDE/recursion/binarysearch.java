
public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 6;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    public static int search(int[] arr, int target, int start, int end){
            if (start>end) {
                return -1;
            }
            int mid = start + (end-start)/2;

            if(arr[mid]==target) return mid;
            if(arr[mid] > target){
               return search(arr, target, start, mid-1);}
            return search(arr, target, mid+1, end);
    }
}
