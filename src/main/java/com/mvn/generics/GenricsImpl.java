package com.mvn.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by shekhar on 09-08-2018.
 */
public class GenricsImpl {

    // ? extends E (all subType supports )
    // ? super T (superTYpe support

    // This one take exact same parametre like T - Integer
     /* public static <T> void copy(List<T> dst, List<T> src){
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }*/
   /* public static <T> void copy(List<T> dst, List<? extends T> src){
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }*/
   /* public static <T> void copy(List<? super T> dst, List<T> src){
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }*/
    public static <T> void copy(List<? super T> dst, List<? extends T> src){
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    public static void main(String[] args) {
        List<Object> objs = Arrays.<Object>asList(2, 3.14, "four");
        List<Integer> ints = Arrays.asList(5, 6);
        List<Number> num = Arrays.asList(5, 6);
       // 1st
        /* copy(objs , objs);
        //Not possible for different Type
        copy(objs , ints);*/
       //2nd
        /*
         copy(objs,ints);
          copy(objs , objs);
         //not possible objs is not a subtype of ints
        copy(ints, objs);*/

        //3rd
        /*copy(objs,ints);
        copy(objs,objs);
        //not possible ints is not super type of object
        copy(ints,objs);*/

        //4th
        //Check what are the common values which can be added for the solution
        copy(objs,ints);
        copy(ints,ints);
        copy(objs,objs);
        copy(objs ,num);
        copy(num , ints);
        //copy(num , objs);
       // copy(ints,objs);

    }
}
