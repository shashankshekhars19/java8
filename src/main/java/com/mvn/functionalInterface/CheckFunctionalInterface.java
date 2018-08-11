package com.mvn.functionalInterface;

/**
 * Created by shekhar on 07-08-2018.
 */
public class CheckFunctionalInterface {

    public static void solve(MySolutionInterface solutionInterface){
        solutionInterface.solveProblem();
    }
    public static void main(String[] args) {
        solve(() -> {
            System.out.println("My method");
        });

        solve(new MySolutionInterface() {
            @Override
            public void solveProblem() {
                System.out.println("Test ");
            }
        });
    }
}
