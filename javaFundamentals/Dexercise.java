package javafundamentals;

import java.util.Scanner;

public class Dexercise {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("1. Dollar\n 2. Euro\n 3. Pound");
        System.out.println("Enter currency");
        int currency = ip.nextInt();
        System.out.println("Enter your money");

        float money = ip.nextFloat();
        float convertedAmount;

        switch (currency) {
            case 1:
                System.out.println("Your amount in Dollar: " + money);
                convertedAmount = money * 4150; 
                System.out.println("Converted money : KHR" + convertedAmount);
                break;
            case 2:
                System.out.println("Your amount in Euro: " + money);
                convertedAmount = money * 4600;
                System.out.println("Converted money : KHR" + convertedAmount);
                break;
            case 3:
                System.out.println("Your amount in Pound: " + money);
                convertedAmount = money * 5000; 
                System.out.println("Converted money : KHR" + convertedAmount);
                break;
            default:
                System.out.println("Invalid currency selection");
        }

    }

}