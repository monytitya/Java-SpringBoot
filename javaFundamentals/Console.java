package javafundamentals;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Your name :");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", your age is " + age);
        System.out.println("Hello " + name + ", my name is  " + name);
        sc.next();
    }
}