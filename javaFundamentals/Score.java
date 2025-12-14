package javaFundamentals;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter score1: ");
        float score1 = sc.nextFloat();
        
        System.out.print("Enter score2: ");
        float score2 = sc.nextFloat();
        
        System.out.print("Enter score3: ");
        float score3 = sc.nextFloat();
        
        System.out.print("Enter score4: ");
        float score4 = sc.nextFloat();
        
        System.out.print("Enter score5: ");
        float score5 = sc.nextFloat();
        
        float total = score1 + score2 + score3 + score4 + score5;
        float average = total / 5;
        System.out.println("=============================||==========================");
        System.out.println("Score1: " + score1);
        System.out.println("Score2: " + score2);
        System.out.println("Score3: " + score3);
        System.out.println("Score4: " + score4);
        System.out.println("Score5: " + score5);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("=============================||==========================");
        
        sc.close();
    }
}