package com.ajay.learning;

public class OperatorDemo {
    int a = 25;
    int b = 4;
    public static void main(String[] args){
        int a = 25;
        int b = 4;
        OperatorDemo armOp = new OperatorDemo();
        armOp.arithematicOperations();
        System.out.println("-------------------------------------");
        armOp.comparisonOperations();
        System.out.println("-------------------------------------");
        armOp.logicalOperations();
        System.out.println("-------------------------------------");
        armOp.unaryOperations();
        System.out.println("-------------------------------------");

        //Part B
        boolean isGreater = a > b ;
        System.out.println("A is greater than B? "+isGreater);
        System.out.println("-------------------------------------");
        armOp.assignmentOperations();
    }
    public void arithematicOperations(){
        //Part A
        System.out.println("Addition Value: "+(a + b));
        System.out.println("Subtraction Value: "+(a - b));
        System.out.println("Multiplication Value: "+(a * b));
        System.out.println("Division Value: "+ ((double) a / b));
        System.out.println("Modulus Value: "+(a % b));
    }

    public void comparisonOperations(){
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);
    }

    public void logicalOperations() {

        int age = 27;
        boolean hasExperience = true;

        System.out.println(age > 25 && hasExperience);
        System.out.println(age < 25 || hasExperience);
        System.out.println(!hasExperience);
    }

    public void unaryOperations() {

        int count = 5;
        System.out.println(count++); //5
        System.out.println(++count); //7
        System.out.println(count--); //7
        System.out.println(--count); //5
    }

    public void assignmentOperations(){
        int number = 20;

        number /= 3;
        System.out.println(number);
        number *= 4;
        System.out.println(number);
        number %= 5;
        System.out.println(number);

        System.out.println(number);
    }
}
