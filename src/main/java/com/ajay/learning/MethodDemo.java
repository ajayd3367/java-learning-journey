package com.ajay.learning;

public class MethodDemo {
    public static void main(String[] args){
        MethodDemo demo = new MethodDemo();
        //demo.greet();
        MethodDemo.greet();
        demo.calculate(200, 300);
        demo.introduceSelf();
    }
    public static void greet(){
        System.out.println("Hello Dev!");
    }

    public void calculate(int a, int b){
        int sum=a+b;
        System.out.println("The sum of "+a+"+"+b+" is:"+sum);
    }

    public void introduceSelf(){
        System.out.println("My name is Ajay.");
        System.out.println("I am a Senior Software Engineer.");
        System.out.println("I am learning Java to become a strong backend engineer.");
        System.out.println("My goal is to crack a high-paying product-based company.");
    }
}
