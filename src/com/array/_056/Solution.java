package com.array._056;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliang on 2020/1/19.
 */

public class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        sort(intervals);
        int[] res = intervals[0];
        System.out.println("res[0]: " + res[0] + " res[1]: " + res[1]);
        List<Interval> rets = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= res[1]) {
                res[1] = Math.max(intervals[i][1], res[1]);
            } else {
                rets.add(new Interval(res[0], res[1]));
                res = intervals[i];
            }
            System.out.println("res[0]: " + res[0] + " res[1]: " + res[1]);
        }
        rets.add(new Interval(res[0], res[1]));
        int[][] result = new int[rets.size()][2];
        for (int i = 0; i < rets.size(); i++) {
            result[i][0] = rets.get(i).front;
            result[i][1] = rets.get(i).back;
        }
        return result;
    }

    class Interval {
        public int front;
        public int back;
        Interval(int front, int back) {
            this.front = front;
            this.back = back;
        }
    }

    private void sort(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length-1-i; j++) {
                if (intervals[j][0] > intervals[j+1][0]) {
                    int[] tem = intervals[j];
                    intervals[j] = intervals[j+1];
                    intervals[j+1] = tem;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] coll = new int[][]{{4,5}, {1,4},{0,1}};
        s.sort(coll);
        for (int[] res : coll) {
            System.out.println("res[0]: " + res[0] + " res[1]: " + res[1]);
        }
//        s.merge(coll);
    }

}
