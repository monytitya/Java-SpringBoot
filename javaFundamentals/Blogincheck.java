package javafundamentals;

import java.util.Scanner;
public class Blogincheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter email");
        String email = sc.nextLine();

        System.out.println("Enter password");
        String password = sc.nextLine();

        if (email.isEmpty()) {
            System.out.println("Email is required");
            return;
        }
        if (!email.contains("@") || !email.contains("."))
        {
             System.out.println("Invailid email format");
             return;
        }
        if (password.isEmpty()){
            System.out.println("Password is required");
            return;
       }
       if (password.length() < 4){
            System.out.println("Password must be at least a characters");
            return;
       }
       System.out.println("login  successfull");
       sc.close();
    }
}
