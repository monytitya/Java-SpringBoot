package javaFundamentals;

import java.util.Scanner;

public class Products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Code: ");
        int code = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter qty: ");
        int qty = sc.nextInt();
        
        System.out.print("Enter price: ");
        float price = sc.nextFloat();
        
        float totald = qty * price;
        float totalr = totald * 1.1f; 
        System.out.println("==========================||==========================");
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Qty: " + qty);
        System.out.println("Price: " + price);
        System.out.println("Totald: " + totald);
        System.out.println("Totalr: " + totalr);
       System.out.println("==========================||==========================");

        
        sc.close();
    }
}
