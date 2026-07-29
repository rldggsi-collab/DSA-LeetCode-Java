import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort intervals according to starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        int s1 = intervals[0][0];
        int e1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int s2 = intervals[i][0];
            int e2 = intervals[i][1];

            // Overlap
            if (e1 >= s2) {
                s1=s1;
                e1 = Math.max(e1, e2);
            }

            // No overlap
            else {
                list.add(new int[]{s1, e1});

                s1 = s2;
                e1 = e2;
            }
        }

        // Add the last interval
        list.add(new int[]{s1, e1});

        // List<int[]> → int[][]
        int[][] arr = list.toArray(new int[list.size()][]);
        return arr;
    }
}