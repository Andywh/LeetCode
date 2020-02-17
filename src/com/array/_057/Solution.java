package com.array._057;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliang on 2020/1/19.
 */
public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<Interval> rets = new ArrayList<>();
        int cur = 0, N = intervals.length;
        // 寻找第一个有重叠的区间
        while (cur < N && intervals[cur][1] < newInterval[0]) {
            rets.add(new Interval(intervals[cur][0], intervals[cur][1]));
            cur++;
        }
        // 合并区间
        Interval interval = new Interval(newInterval[0], newInterval[1]);
        while (cur < N && intervals[cur][0] <= newInterval[1]) {
            interval.start = Math.min(intervals[cur][0], interval.start);
            interval.end = Math.max(intervals[cur][1], interval.end);
            cur++;
        }
        rets.add(interval);
        while (cur < N) {
            rets.add(new Interval(intervals[cur][0], intervals[cur][1]));
            cur++;
        }
        int[][] result = new int[rets.size()][2];
        for (int i = 0; i < rets.size(); i++) {
            result[i][0] = rets.get(i).start;
            result[i][1] = rets.get(i).end;
        }
        return result;
    }

    private class Interval {
        public int start;
        public int end;

        public Interval() {
        }

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
