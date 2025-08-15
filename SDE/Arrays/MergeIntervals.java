import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
            {1,3},
            {2,6},
            {8,10},
            {15,18}
        };
        int temp[][] = intervals;
        System.out.println(Arrays.deepToString(merge(temp)));
    }

    public static int[][] merge(int[][] intervals) {

        //chat gpt solution 



        if (intervals.length <= 1) return intervals;

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // If overlapping
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]); // merge
            } else {
                merged.add(current); // push merged interval
                current = intervals[i]; // move to next
            }
        }

        merged.add(current); // add last one

        return merged.toArray(new int[merged.size()][]);
    }
}
