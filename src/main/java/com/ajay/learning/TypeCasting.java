package com.ajay.learning;

public class TypeCasting {
    public static void main(String[] args) {

        System.out.println("-----------------------------");
        //Convert an int value of 100 into a double.
        int varInt = 100;
        double newInt = varInt;
        System.out.println("Original Integer Values: "+ varInt);
        System.out.println("Integer converted to double: " + newInt);
        System.out.println("-----------------------------");

        //Convert a double value of 99.99 into an int.
        double varDouble = 99.99;
        int newDouble = (int) varDouble;
        System.out.println("Original Double Values: "+ varDouble);
        System.out.println("Double converted to Integer: "+newDouble);
        System.out.println("-----------------------------");

        //Convert a long value into an int.
        long varLong = 3000000000L;
        int newLong = (int) varLong;
        System.out.println("Original Long Values: "+ varLong);
        System.out.println("Long converted to Integer: "+newLong);
        System.out.println("-----------------------------");

        //Convert an int value into a long.
        int varInt2 = 10;
        long newInt2 = (long) varInt2;
        System.out.println("Original Integer Values: "+ varInt2);
        System.out.println("Int converted to long: "+newInt2);
        System.out.println("-----------------------------");

        System.out.println("**BONUS CHALLENGE**");
        int a = 10;
        int b = 3;
        System.out.println(a / b);
        System.out.println((double) a / b);  
    }
}
