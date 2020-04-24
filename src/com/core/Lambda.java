package com.core;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ai Lun on 2020-04-25.
 */
public class Lambda {

    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println(addition.operation(3,4));

        //
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        players.forEach((player) -> System.out.println(player + ","));

        players.forEach(System.out::println);
    }

    interface MathOperation {
        int operation(int a, int b);
    }
}
