package com.mvn.myproject;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Arrays.asList(1,2,3).forEach( e -> System.out.print(e));

        Arrays.asList(7,3,8,2).forEach(e ->{
            System.out.println(e);

        });


        Arrays.asList(5,4,4).stream().filter( e ->
            !e.equals(5)
        ).forEach( e-> System.out.print(e));


    }
}
