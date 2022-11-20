package com.dhan;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int varInt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
          varInt = sc.nextInt();//nextInt method of Scanner Class
        System.out.println("Entered NUmber is " + varInt);
    }

}
