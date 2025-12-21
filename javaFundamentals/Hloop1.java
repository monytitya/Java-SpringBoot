package javafundamentals;

public class Hloop1 {
    public static void main(String[] args) {
         String[][] seats = {
            //0    1     2    3    4
            {"C1","C2","C3","C4","C5"}, // 0
            {"B1","B2","B3","B4","B5"},//  1
            {"A1","A2","A3","A4","A5"},//  2
        };
        // System.out.println(seats[0][0]+ "");
        // System.out.println(seats[0][1]+ "");
        // System.out.println(seats[0][2]+ "");
        // System.out.println(seats[0][3]+ "");
        // System.out.println(seats[0][4]+ "");
        // System.out.println('\n');

        // System.out.println(seats[1][0]+ "");
        // System.out.println(seats[1][1]+ "");
        // System.out.println(seats[1][2]+ "");
        // System.out.println(seats[1][3]+ "");
        // System.out.println(seats[1][4]+ "");
        // System.out.println('\n');

        // System.out.println(seats[2][0]+ "");
        // System.out.println(seats[2][1]+ "");
        // System.out.println(seats[2][2]+ "");
        // System.out.println(seats[2][3]+ "");
        // System.out.println(seats[2][4]+ "");
        // System.out.println('\n');
        // System.out.println(seats[3][0]+ "");
        // System.out.println(seats[3][1]+ "");
        // System.out.println(seats[3][2]+ "");
        // System.out.println(seats[3][3]+ "");
        // System.out.println(seats[3][4]+ "");

        
        // for(int col =0; col < 5; col++)
        // {
        //     System.out.print(seats[0][col]);
        // }
        
        System.out.print("---------------\n");
        System.out.print("|    SCREEN   |\n");
        System.out.print("--------------\n");
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
}
