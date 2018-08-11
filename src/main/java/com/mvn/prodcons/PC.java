package com.mvn.prodcons;

import java.util.LinkedList;

/**
 * Created by shekhar on 07-08-2018.
 */
public class PC {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;
    int val = 0;
    // Function to produce number
    public void produce() throws InterruptedException{

        while (true) {
            synchronized (this){
                while (list.size()==capacity)
                    wait();

                System.out.println("Producer producced - "+ val);
                list.add(val++);

                notify();
                Thread.sleep(500);

            }
        }
    }

    public void consume() throws InterruptedException{

        while(true) {
            synchronized (this) {
                while (list.size() == 0)
                    wait();

                int val = list.removeFirst();

                System.out.println("Value Consumed - " + val);

                notify();

                Thread.sleep(5000);
            }
        }
    }
}
