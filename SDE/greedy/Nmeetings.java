import java.util.*;

public class Nmeetings {
    public static int maxMeetings(int[] start, int[] end){
        List<int[]>  list = new ArrayList<>();
        int len = start.length;

        for(int i=0; i<len; i++){
            list.add(new int[]{start[i], end[i]});

        }


        list.sort((a,b)-> a[1] - b[1] );

        int count=1;
        int lasele=Integer.MIN_VALUE;
        for(int i=1; i<list.size(); i++){
            int elestart = list.get(i)[0];
            int eleend = list.get(i)[1];

            if(elestart > lasele){
                count++;
                lasele = eleend;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int start [] = {1, 3, 0, 5, 8, 5};
        int end [] = {2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(start, end));
    }
}