package javabasic;
import java.util.Scanner;
public class InputValue_class2 {
    public static void main(String[] args) {
        System.out.println("hello user");
        Scanner db = new Scanner(System.in);
        System.out.println("what is your fathers age?");
        int a = db.nextInt();
        System.out.println("what is your age?");
        int b = db.nextInt();
        int sum = a-b;
        System.out.println("difference between you and your father's age is "+ sum);
    }
}