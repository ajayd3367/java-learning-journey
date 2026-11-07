package com.ajay.learning;

public class VariableDemo {
    public static void main(String[] args){
        String name = "Ajay";
        int age = 27;
        double height = 167.00;
        char grade = 'A';
        boolean isLearningJava = true;
        long salary = 1600000L;
        System.out.println("I am: "+name);
        System.out.println("I am "+age+" years young");
        System.out.println("height: "+height);
        System.out.println("Grade: "+grade);
        System.out.println("Is Learning Java? "+isLearningJava);
        System.out.println("I make: "+salary+" annually");
        int newAge = age + 5;
        System.out.println("My age after 5 years will be: "+newAge);
        long newSalary = salary*2;
        System.out.println("Salary time 2 is: "+ newSalary);
        double newHeight = height/100;
        System.out.println("Height in meter is: "+newHeight+" meters");
    }


}
