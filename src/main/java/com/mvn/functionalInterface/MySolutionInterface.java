package com.mvn.functionalInterface;

/**
 * Created by shekhar on 07-08-2018.
 */
public interface MySolutionInterface extends MyFirstFunctionalInterface  {

    default  public void doCalculation(int a , int b){
        System.out.println(a+b);
    }

    default public void doNothing(int a , int b){
        System.out.println("Nothing to do");
    }

}
