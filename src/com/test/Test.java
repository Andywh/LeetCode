package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-06-21.
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(3);
        System.out.println(l);
        new Test().add(l, 4);
        System.out.println(l);
        System.out.println("end");
    }

    private List<Integer> add(List<Integer> list, Integer num) {
        list.add(num);
        return list;
    }
}
