package com.yash;

import java.util.Scanner;

public class CWH_CH2_PS {
    public static void main(String[] args) {

        // Q.1 ->
        float res = (float) ((7.4) * (9/2));
        System.out.println("res = " + res);


        // Q.2 ->
        // encrypt
        char grade = 'B';
        grade += 8;
        System.out.println("encrypted grade = " + grade);
        // decrypt
        grade -= 8;
        System.out.println("decrypted grade = " + grade);


        // Q.3 ->
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);


        // Q.4 ->
        int v = 1,u = 2;
        float expression = (float) ((v*2-u*2)/2*a*5);
        System.out.println("expression = " + expression);


        // Q.5 ->
        int x = 7;
        System.out.println("value of a " + 7*49/7+35/x);

    }
}
