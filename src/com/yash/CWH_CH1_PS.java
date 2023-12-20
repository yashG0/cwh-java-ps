package com.yash;

import java.util.Scanner;

public class CWH_CH1_PS {
    public static void main(String[] args) {
        // Q.1 ->
        int a = 4;
        int b = 7;
        int c = 11;
        int sum = a+b+c;
        System.out.println("sum = " + sum);


        // Q.2 ->
        int sub1 = 68;
        int sub2 = 81;
        int sub3 = 55;

        float cgpa = (float) (sub1 + sub2 + sub3) / 30;
        System.out.println("cgpa = " + cgpa);


        // Q.3 ->
        System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day!");


        // Q.4 ->
        System.out.println("Enter a value in (km): ");
        float valueInKm = sc.nextFloat();
        float valueInm = (float) (valueInKm * 0.621371);
        System.out.println("miles = " + valueInm);


        // Q.5 ->
        System.out.println("What's your number ");
        System.out.println(sc.hasNextInt());
        sc.close();
    }
}
