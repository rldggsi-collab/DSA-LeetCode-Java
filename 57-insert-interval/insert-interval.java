import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

        // s1, e1 represent the new interval
        int s1 = newInterval[0];
        int e1 = newInterval[1];

        for (int i = 0; i < intervals.length; i++) {

            int s2 = intervals[i][0];
            int e2 = intervals[i][1];

            // Case 1: Current interval is BEFORE new interval
            if (e2 < s1) {

                list.add(new int[]{s2, e2});
            }

            // Case 2: Current interval is AFTER new interval
            else if (s2 > e1) {

                list.add(new int[]{s1, e1});

                // Now make current interval our new s1, e1
                s1 = s2;
                e1 = e2;
            }

            // Case 3: Overlap
            else {

                s1 = Math.min(s1, s2);
                e1 = Math.max(e1, e2);
            }
        }

        // Add the last remaining interval
        list.add(new int[]{s1, e1});

        return list.toArray(new int[list.size()][]);
    }
}