package com.string._030;

/**
 * Created by songliang on 2020/1/11.
 */
public class Test {

    public static void main(String[] args) {
        String longStr = "alsdjflddafd";
        String shortStr = "ab";
        for (int i = 0; i< longStr.length() - shortStr.length(); i++) {
            System.out.println(i + " " + longStr.charAt(i));
        }
    }

}
