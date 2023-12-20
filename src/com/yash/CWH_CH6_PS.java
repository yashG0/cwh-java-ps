package com.yash;

public class CWH_CH6_PS {
    public static void main(String[] args) {

        // Q.1 ->
        float[] marks = {25.3f, 12.21f, 1.1f, 23.2f};
        float sum=0;
        for (float mark:marks){
            sum+=mark;
        }
        System.out.println("sum = " + sum);


        // Q.2 ->
        int[] arr = {22,12,6,4};
        int element = 6;
        boolean isArray = false;

        for (int arr_element:arr){
            if(arr_element==element){
                isArray = true;
                break;
            }
        }
        if(isArray){
            System.out.println("Value found " + element);
        }else {
            System.out.println("Value not found");
        }


        // Q.3 ->
        int[] arr2 = {12,32,31,1};
        int sumOfArray = 0;
        for (int arr_element:arr2){
            sumOfArray+=arr_element;
        }
        int avg = (sumOfArray/arr2.length);
        System.out.println("The average of Number: " + avg);


        // Q.4 ->
        int[][] arr3 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] arr4 = {
                {7,8,9},
                {10,11,12}
        };
        int[][] res = {
                {0,0,0},
                {0,0,0}
        };
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                res[i][j] = arr3[i][j] + arr4[i][j];

            }
        }
    }
}
