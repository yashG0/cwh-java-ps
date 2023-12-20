package com.yash;

import java.util.Scanner;

public class CWH_CH4_PS {
    public static void main(String[] args) {

        // Q.1 ->
        int a = 10;
        if(a == 11){
            System.out.println("a is 11");
        }else{
            System.out.println("a is not 11");
        }


        // Q.2 ->
        Scanner sc = new Scanner(System.in);
        byte sub1,sub2,sub3;

        System.out.println("Enter marks in Math: ");
        sub1 = sc.nextByte();

        System.out.println("Enter marks in CS: ");
        sub2 = sc.nextByte();

        System.out.println("Enter marks in Science: ");
        sub3 = sc.nextByte();

        float avg = (float) ((sub1+sub2+sub3)/3);
        if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("congratulation, You've been promoted");
        }else{
            System.out.println("average = " + avg);
            System.out.println("Sorry, You haven't been promoted");
        }


        // Q.3 ->
        System.out.println("Enter your income (per year)");
        int income = sc.nextInt();
        float tax = 0;

        if (income >= 1000000) {
            tax = (float) (20.0 / 100) * income;
        } else if (income >= 500000) {
            tax = (float) (15.0 / 100) * income;
        } else if (income >= 250000) {
            tax = (float) (8.0 / 100) * income;
        } else {
            tax += 0;
        }
        System.out.println("Income: " + income);
        System.out.println("You have to pay " + (int) tax + " tax");


        // Q.4 ->
        System.out.println("Enter the number (1-7)");
        byte num = sc.nextByte();
        switch (num){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }


        // Q.5 ->
        System.out.println("Enter the Year to check whether leap year or not");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Entered year is leap year");
        }else{
            System.out.println("Entered year isn't leap year");
        }


        // Q.6 ->
        System.out.println("Enter the url of website: ");
        String web = sc.next();
        if(web.endsWith(".org")){
            System.out.println("This is an organization website");
        } else if (web.endsWith(".com")) {
            System.out.println("This is a commercial website");
        } else if (web.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } else {
            System.out.println("This is an other website");
        }
    }
}
