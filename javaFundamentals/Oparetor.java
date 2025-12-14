package javaFundamentals;

import java.util.Scanner;
public class Oparetor {
    public static void main(String[] args) {
        //  +  -  *  /  %
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dp: ");
        int dp = sc.nextInt();

        System.out.print("Enter pacent: ");
        int pacent = sc.nextInt();

        int total = dp * pacent / 100;
        int rs = dp - total;
        System.out.println("===================||=============");
        System.out.println("Dp :" + dp);
        System.out.println("pacent :" + pacent);
        System.out.println("Total :" + total);
        System.out.println("Rs :" + rs);
        System.out.println("===================||=============");
    }
}
