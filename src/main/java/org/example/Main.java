package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

       /* Person unknown = new Person();
        Person maria = new Person("Maria", 21);*/

        // unknown.printInfo();
        // maria.printInfo();

        /*String  category = Person.ageCategory(18);
        System.out.println(category);*/


     /*  int sum = Calculator.add (2, 5);
        System.out.println(sum);

        int subtraction = Calculator.minus (5, 3);
        System.out.println(subtraction);

        int multiply = Calculator.multiplication (2, 3);
        System.out.println(multiply);

        int divide = Calculator.division (10, 2);
        System.out.println(divide);
*/

       /*
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.5);

        circle2.calculateArea();*/

        /*Square sq = new Square();
        sq.setLength(5);

        System.out.println(sq.getLength());*/

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 4);
        
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());

        System.out.println(rectangle1.calculateArea());




    }

}