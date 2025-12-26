package javafundamentals;

import java.util.Scanner;

public class Hloopchose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] seats = {
            {"C1", "C2", "C3", "C4", "C5"},
            {"B1", "B2", "B3", "B4", "B5"},
            {"A1", "A2", "A3", "A4", "A5"}
        };

        // Show initial seats
        showSeats(seats);

        System.out.print("\nHow many persons? ");
        int persons = input.nextInt();

        int booked = 0;

        while (booked < persons) {

            System.out.print("Enter seat for person " + (booked + 1) + ": ");
            String sit = input.next().toUpperCase();

            boolean found = false;

            for (int row = 0; row < seats.length; row++) {
                for (int col = 0; col < seats[row].length; col++) {

                    if (seats[row][col].equals(sit)) {
                        seats[row][col] = "XX";
                        booked++;
                        found = true;
                        System.out.println("Seat " + sit + " booked!");
                        break;
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println("Already booked ,plz try  again");
            }

            showSeats(seats);
        }

        System.out.println("\n Seats have been booked already!!!");
        input.close();
    }

    // Display seats
    static void showSeats(String[][] seats) {
        System.out.println("---------------");
        System.out.println("|   SCREEN    |");
        System.out.println("---------------");

        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }
    }
}
