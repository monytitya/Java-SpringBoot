package javafundamentals;

import java.util.Scanner;

public class HLoopSeatsKun {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String[][] seats = {
            //  0     1     2     3     4
            {"C1", "C2", "C3", "C4", "C5"}, // Row 0
            {"B1", "B2", "B3", "B4", "B5"}, // Row 1
            {"A1", "A2", "A3", "A4", "A5"}  // Row 2
        };

        String sit;
        int check = 0;

        System.out.println("---------------");
        System.out.println("|   SCREEN    |");
        System.out.println("---------------");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }
        System.out.print("\nEnter your seat: ");
        sit = input.next();

        // Search & book seat
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {

                if (sit.toUpperCase().equals(seats[row][col])) {
                    seats[row][col] = "XX"; 
                    check = 1;
                }
            }
        }

        if (check == 0) {
            System.out.println("❌ Invalid seat input, please try again.");
            return;
        }

        // Display updated seats
        System.out.println("\n---------------");
        System.out.println("|   SCREEN    |");
        System.out.println("---------------");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }

        input.close();
  }
} 
