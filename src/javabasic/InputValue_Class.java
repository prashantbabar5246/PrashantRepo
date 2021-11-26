package javabasic;
import java.util.Scanner;


public class InputValue_Class {
    public static void main(String[] args) {
        System.out.println("prashant");
        Scanner pb = new Scanner(System.in); //Object created for Scanner Class
        System.out.println("enter number one is");
        int a = pb.nextInt(); //value entered from keyboard,it is saved in variable "a"     next.in is a method from Scanner Class
        System.out.println("enter number two is");
        int b = pb.nextInt(); //value entered from keyboard,it is saved in variable "b"     next.in is a method from Scanner Class
        int sum = a+b;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);
    }

}