import java.util.*;

class interval {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> res = new ArrayList<>();

        int[] curr = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            int[] interval = intervals[i];

            if (curr[1] >= interval[0]) {
                curr[1] = Math.max(curr[1], interval[1]);
            } else {
                res.add(curr);
                curr = interval;
            }
        }

        res.add(curr);

        return res.toArray(new int[res.size()][]);
    }
}
