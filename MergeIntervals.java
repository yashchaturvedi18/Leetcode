import java.util.*;
class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]>o2[1])
                    return 1;
                if(o1[0]<o2[1])
                    return -1;
                else
                    return 0;
            }
        });
        // Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
        // Output: [[1,6],[8,10],[15,18]]
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> current = new ArrayList();
        current.add(intervals[0][0]);
        current.add(intervals[0][1]);
        res.add(current);
        for(int i = 1;i<intervals.length;i++){
            int s = res.size();
                if(res.get(s-1).get(1)>intervals[i][0]){
                    res.get(s-1).set(1,Math.max(res.get(s-1).get(1),intervals[i][1]));
                }
                else{
                    List<Integer> newInterval = new ArrayList<>();
                    newInterval.add(intervals[i][0]);
                    newInterval.add(intervals[i][1]);
                    res.add(newInterval);
                }

        }
        int rows = res.size();
        int[][] mat = new int[rows][2];
        for(int i = 0;i<rows;i++){
            mat[i][0]=res.get(i).get(0);
            mat[i][1]=res.get(i).get(1);
        }
        return mat;
    }
}