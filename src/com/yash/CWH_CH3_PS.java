package com.yash;

import java.util.Scanner;

public class CWH_CH3_PS {
    public static void main(String[] args) {

        // Q.1 ->
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        System.out.println("Entered String = " + str);
        str = str.toLowerCase();
        System.out.println("Lowercase String = " + str);


        // Q.2 ->
        String text = "To lower case";
        text = text.replace(' ','_');
        System.out.println(text);


        // Q.3 ->
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Yash");
        System.out.println(letter);


        // Q.4 ->
        String myStr = "This  is my String   Container";
        System.out.println(myStr.indexOf("  "));
        System.out.println(myStr.indexOf("Container"));


        // Q.5 ->
        String myStr2 = "Hello Harry,\nThis Java course is nice.\n\tThanks!";
        System.out.println(myStr2);
    }
}
