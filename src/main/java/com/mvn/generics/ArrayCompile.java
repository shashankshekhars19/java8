package com.mvn.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by shekhar on 10-08-2018.
 */
public class ArrayCompile {

    public static void main(String[] args) {
        Integer[] ints = new Integer[] {1,2,3};
        Number[] nums = ints;
        //Co-variant you can fool compiler but can't run-time . It treats as an int not as num
        nums[2] = 3.14; // array store exception

        //Generic has a better implementation
        List<Integer> integerList = Arrays.asList(1,2,3,5);
        //next line is not valid so not allowed in compile time only
        //List<Number> numberList = integerList;
        List<? extends Object> numberList = integerList;
        //numberList.add(2, 2.4);

    }
}
