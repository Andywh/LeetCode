package com.core._consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Ai Lun on 2020-04-25.
 */
public class _Consumer {

    public static void main(String[] args) {
        //Function;
        //Supplier;
        //Consumer;
        //Predicate;
        List<User> l = new ArrayList<>();
        //l.add(new User("Andy", 29));
        //l.add(new User("Chen", 19));
        //l.add(new User("Wang", 40));
        Consumer<User> consumer = x -> {
            if (x.getAge() > 18) {
                l.add(x);
            }
        };
        Stream.of(
                new User("Andy", 29),
                new User("SS", 19),
                new User("AA", 13),
                new User("BB", 12),
                new User("DD", 10),
                new User("CC", 11)
        ).forEach(consumer);
        System.out.println(l);
    }
}
