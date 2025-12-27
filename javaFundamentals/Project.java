package javafundamentals;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String[][] seats = {
                {"C1", "C2", "C3", "C4"}, 
                {"B1", "B2", "B3", "B4"}, 
                {"A1", "A2", "A3", "A4"} 
        };

  
        int mokmarnek;

        System.out.println("------------");
        System.out.println("|  SCREEN  |");
        System.out.println("------------");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }

        int totalseat = 12;

        while (true) {

            if (totalseat == 0) {
                System.out.println("Full hx b som tv hall muy tt tv");
                break;
            }

            System.out.print("Mok Man Nek: ");
            String input = sc.nextLine();


            try {
                mokmarnek = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ke sur mok marn nek dak ah sor!");
                continue;
            }

            if (totalseat < mokmarnek) {
                System.out.println("Sol tea " + totalseat + " chairs te bong");
                continue;
            }

            totalseat -= mokmarnek;


            String[] chair = new String[mokmarnek];

            for (int i = 0; i < mokmarnek; i++) {
                System.out.print("Enter your chair: ");
                chair[i] = sc.nextLine().toUpperCase();
            }

            boolean check = false;

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 4; col++) {
                    for (int sit = 0; sit < mokmarnek; sit++) {
                        if (chair[sit].equals(seats[row][col])) {
                            seats[row][col] = "X";
                            check = true;
                        }
                    }
                }
            }

            if (!check) {
                totalseat += mokmarnek;
                System.out.println("Khos hx bro ot mean chair ng te!");
                continue;
            }


            System.out.println("Available Seat: " + totalseat);

            System.out.println("------------");
            System.out.println("|  SCREEN  |");
            System.out.println("------------");

            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 4; col++) {
                    System.out.print(seats[row][col] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
