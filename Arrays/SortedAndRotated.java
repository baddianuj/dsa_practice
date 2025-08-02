public class SortedAndRotated {
    public static boolean check(int[] arr) {
       int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            if (arr[i] > arr[next]) {
                count++;
            }
        }

        if(count <=1 ) return true;
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,3,4};
        System.out.println(check(arr));

    }
}
