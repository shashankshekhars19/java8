package com.mvn.sort;

/**
 * Created by shekhar on 09-08-2018.
 */
public class MergeClasss {

    static int MAX_VALUE = Integer.MAX_VALUE;

    public static int[] merge(int[] a, int i, int n, int k) {
        int m = n-i;
        int o = k-n+1;


        int[] x = new int[m+1];
        int[] y = new int[o+1];



        return a;
    }

    public static void mergeSort(int[] a, int i, int j) {
        int k = (i + j) / 2;
        mergeSort(a, i, k);
        mergeSort(a, k + 1, j);
        merge(a, i, k, j);
    }

    public static void main(String[] args) {
        int[] a = new int[]{9, 3, 1, 6, 2, 7, 5};
        MergeClasss.mergeSort(a, 0, (int)a.length);
    }
}
