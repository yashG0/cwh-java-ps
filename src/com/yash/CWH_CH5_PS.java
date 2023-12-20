package com.yash;

import java.util.Scanner;

public class CWH_CH5_PS {
    static void multiple(int num){
        for (int i = 1; i < 11; i++) {
            System.out.format("%d X %d = %d\n",num,i,num*i);
        }
    }
    static void starPattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void starPattern2(int numRows){
        for (int i = numRows; i >= 1; i--) {
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }

    static int sumRect(int num){
        if(num==1){
            return 1;
        }
        return num + sumRect(num-1);
    }

    static int finboSeries(int num){
        if (num==1){
            return 0;
        } else if (num==2) {
            return 1;
        }else {
            return finboSeries(num-1)+finboSeries(num-2);
        }
    }


    public static void main(String[] args) {

        // Q.1 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate multiples");
        int num = sc.nextInt();
        multiple(num);


        // Q.2 ->
        starPattern1(4);


        // Q.3 ->
        System.out.println("Sum of first 5 number -> "+sumRect(5));


        // Q.4 ->
        starPattern2(4);


        // Q.5 ->
        System.out.println("Enter number for fibonacci series");
        int fiboNum = sc.nextInt();
        System.out.println("Fibonacci Sequence = " + finboSeries(fiboNum));

    }
}
