package com.shopee.code1;

import java.util.Scanner;

/**
 * Created by Ai Lun on 2019-06-28.
 */
public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String s1 = sc.nextLine();
        //String s2 = sc.nextLine();
        // 1. 找出有多少字符相同

        // 2. 补齐长度
        // 3.
        //System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        //Integer len = 1*1024*1024*3024;
        //byte[] byteArray = new byte[len];
        //System.out.println("good 111");

        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("MAX_MEMORY = " + maxMemory + " (字节)、" + (maxMemory / (double)1024 / 1024) + "MB");
        System.out.println("TOTAL_MEMORY = " + totalMemory + "(字节)、" + (totalMemory / (double)1024 / 1024) + "MB");
    }
}
