package com.core._default;

/**
 * Created by Ai Lun on 2020-04-25.
 */
public class Test implements Interface1, Interface2 {

    @Override
    public void hello() {
        System.out.println("override");
    }


    public static void main(String[] args) {
        Test t = new Test();
        t.hello();
    }

}
