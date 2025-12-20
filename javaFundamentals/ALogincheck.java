package javafundamentals;

import java.util.Scanner;

public class ALogincheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email");
        String email = sc.nextLine();

        System.out.println("Enter password");
        String password = sc.nextLine();

        if (email.isEmpty() || password.isEmpty())
        {
            System.out.println("Email and password cannot empty");
        }
        else if(email.equals("user@example.com") && password.equals("test123")) {
            System.out.println("Login successfull");
        }
        else if(!email.equals("user@example.com"))
        {
            System.out.println("Email is wrong!!!");
        }
        else{
            System.out.println("Password is wrong!!");
        }
        sc.close();
       
    }
}
