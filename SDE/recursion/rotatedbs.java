public class rotatedbs {
    public static void main(String[] args) {
         int arr[] = {5,6,7,8,9,0,1,2,3,4};

        System.out.println(recursionsearch(arr, 3, 0, arr.length-1));
         
    }
    public static int recursionsearch(int arr[], int target, int start, int end){
        if(start > end ) return -1;
        int mid = start + (end-start)/2;

        if(arr[mid]==target) return mid;
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target <arr[mid]){
                return recursionsearch(arr, target, start, mid-1);
            }
            else{
                return recursionsearch(arr, target, mid+1, end);
            }
        }
        else{
            if (target>arr[mid] & target <= arr[end]) {
                return recursionsearch(arr, target, mid+1, end);
            }
            else{
                return recursionsearch(arr, target, start, mid-1);
            }
        }
    }
}