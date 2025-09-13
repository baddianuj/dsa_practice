public class linearseach {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9};
        int target=6;
        System.out.println(search(ar, 0, target));

    }
    public static int search(int[] arr,int index, int target){
        if(arr[index]==target) return index;
        if(index==arr.length-1) return -1;
        return  search(arr, index + 1, target);
    }
}
