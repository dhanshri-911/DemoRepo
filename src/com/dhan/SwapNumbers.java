package com.dhan;

public class SwapNumbers {

    static void swapnumbers(int m, int n)
    {
        int temp = m;
        m=n;
        n=temp;
        System.out.println("value of m " +m + " " + "value of n " + n);
    }

    public static void main(String[] args) {
        int m = 5, n = 15;
        swapnumbers(m,n);
    }
}
