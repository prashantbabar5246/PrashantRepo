package javabasic;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("Hello Student");
        Scanner lb = new Scanner(System.in);
        float percentage;
        System.out.println("Programing in core java marks?");
        float a = lb.nextFloat();
        System.out.println("Software enginering and case tools Marks");
        float b = lb.nextFloat();
        System.out.println("data structure and algo Marks");
        float c = lb.nextFloat();
        System.out.println("computer networks Marks");
        float d= lb.nextFloat();
        System.out.println("English Marks");
        float e = lb.nextFloat();
        System.out.println("405");
        float f = lb.nextFloat();
        System.out.println("406");
        float g = lb.nextFloat();
        System.out.println("407");
        float h = lb.nextFloat();
        System.out.println("408");
        float Scored = a+b+c+d+e+f+g+h;
        System.out.println("Congratulations you Get "+ Scored );

        System.out.println("Enter Total marks");
        float Total_Marks = lb.nextFloat();


        percentage =(float)((Scored/Total_Marks)*100);
        System.out.println("Percentage::"+ percentage);


    }
}

