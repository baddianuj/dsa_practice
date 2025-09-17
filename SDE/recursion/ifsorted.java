public class ifsorted {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        boolean ans = checksorted(arr, 0);
        System.out.println(ans);

    }
    public static boolean checksorted(int arr[] ,int i){
        if(arr.length==0 || i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]) return false;

        return checksorted(arr, i+1);
    }
}
