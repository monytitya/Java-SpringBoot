package javafundamentals;

import java.util.Scanner;

public class Praties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Using for Console Input
        
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter sex: ");
        String sex = sc.nextLine();
        
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Address: " + address);
        
        sc.close();
    }
    
}
