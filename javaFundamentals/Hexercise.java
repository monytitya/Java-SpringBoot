package javafundamentals;

import java.util.Scanner;

public class Hexercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] seats = {
            //0    1     2    3    4
            {"C1","C2","C3","C4","C5"}, // 0
            {"B1","B2","B3","B4","B5"},//  1
            {"A1","A2","A3","A4","A5"},//  2
        };
        
        System.out.print("---------------\n");
        System.out.print("|    SCREEN   |\n");
        System.out.print("---------------\n");
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 5; col++)
               {
                 System.out.print(seats[row][col]+" ");
            }
            System.out.println('\n');
        }
        // Choose a seat
        System.out.println("Choose a row (0-2): ");
        int chosenRow = sc.nextInt();
        System.out.println("Choose a col (0-4): ");
        int chosenCol = sc.nextInt();
        seats[chosenRow][chosenCol] = "seats already";
        
        // Display again
        System.out.print("---------------\n");
        System.out.print("|    SCREEN   |\n");
        System.out.print("---------------\n");
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 5; col++)
               {
                 System.out.print(seats[row][col]+" ");
            }
            System.out.println('\n');

        }        
    }
}


