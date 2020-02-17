package com.backtracking._79;

/**
 * Created by Ai Lun on 2019-10-27.
 */
public class Test {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        sb.append("2");
        sb.append("3");
        System.out.println(sb);
        test(sb);
        System.out.println(sb);

        Boolean isB = false;
        test2(isB);
        System.out.println(isB);
    }

    private static void test2(Boolean isB) {
        isB = true;
    }

    private static void test(StringBuilder sb) {
        sb.append("4");
    }
}
