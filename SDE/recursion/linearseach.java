import java.util.*;

public class linearseach {
    public static void main(String[] args) {
        int ar[]={1,2,5,4,5,6,7,8,9};
        int target=5;
        // System.out.println(search(ar, 0, target));
        search(ar, 0, target);
        System.out.println(list);

    }

    static List<Integer> list = new ArrayList<Integer>();

    // public static int search(int[] arr,int index, int target){
    //     if(arr[index]==target) return index;
    //     if(index==arr.length-1) return -1;
    //     return  search(arr, index + 1, target);
    // }
    public static void search(int[] arr,int index, int target){
        if(arr[index]==target) list.add(index);
        if(index==arr.length-1) return ;
        search(arr, index + 1, target);
    }

    
    // public static boolean search(int[] arr,int index, int target){
    //     if(index==arr.length-1) return false;
    //     return arr[index]==target || search(arr, index + 1, target);
    // }


}
