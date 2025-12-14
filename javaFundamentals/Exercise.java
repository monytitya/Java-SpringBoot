package javaFundamentals;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item1 :");
        float item1 = sc.nextFloat();
     
        System.out.println("Enter item2 :");
        float item2 = sc.nextFloat();

        System.out.println("Enter item3");
        float item3 = sc.nextFloat();

        float total = item1 + item2 + item3;
        float totald = total * 400;
        System.out.println("===================||=============");
        System.out.println("Item1 :" + item1);
        System.out.println("Item2 :" + item2);
        System.out.println("Item 3 :" + item3);
        System.out.println("total :" + total);
        System.out.println("totald :" + totald);
        System.out.println("===================||=============");
    }
}
