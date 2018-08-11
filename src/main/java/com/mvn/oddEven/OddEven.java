package com.mvn.oddEven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shekhar on 07-08-2018.
 */
public class OddEven {



    public static void main(String[] args) throws  InterruptedException{
       PrintValues pv = new PrintValues();

       Thread t1 =  new Thread(() -> {
           try {
               pv.odd();
           }catch (InterruptedException e){

           }
           });

        Thread t2 =  new Thread(() -> {
            try {
                pv.even();
            }catch (InterruptedException e){

            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }

    public static class PrintValues{
        int j =0,i=0;
        static  boolean oddCheck = true;
        public  static  List<Integer> odd = Arrays.asList(1,3,5,7);
        public static List<Integer> even = Arrays.asList(2,4,6,8);
        public void odd() throws  InterruptedException{
            while(true){
                synchronized (this){
                    while(!oddCheck)
                        wait();

                    System.out.println("Odd Number "+ odd.get(i++));
                    oddCheck = false;



                    notify();

                    Thread.sleep(500);
                    if(i==4)
                        break;

                }
                if(i==4)
                    break;
            }
        }
        public void even() throws  InterruptedException{
            while(true){
                synchronized (this){
                    while(oddCheck)
                        wait();

                    System.out.println("Even Number "+ even.get(j++));
                    oddCheck = true;


                    notify();

                    Thread.sleep(500);

                    if(j==4)
                        break;

                }
                if(j==4)
                    break;
            }
        }
    }
}
