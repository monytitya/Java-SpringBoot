package javafundamentals;

import java.util.Arrays;

public class JArray {
    
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);   
        }
        System.out.println("--------------||--------------");
        //Array to String use for covert number data from frontend to backend
        //Array toString()

        
        //Array sort() Using Small to Large
        // Sort data from database that get and store in array
        int[] num1 = {7, 3, 4, 5, 6, 2};
        Arrays.sort(num1);
        for (int key  : num1) {
            System.out.println(key);   
        }
        System.out.println("--------------||--------------");

        //Array equals()
        //Using for search in frontend 
        //Array equals() normaly using for search and comparing
        int[] num2 = {2, 3};
        int[] num3 = {4, 5};
        int[] num4  = {6, 7};
        boolean result = Arrays.equals(num1, num3);
        System.out.println("Arrays are equal: " + result);
        System.out.println("--------------||--------------");


        //Array fill()
        //Using for set default value in array
        //When we use it's: games, leaderboard, high score, 
        int[] num5 = new int[5];
        Arrays.fill(num5, 9);
        for (int key : num5) {
            System.out.println(key);
        }

        //Array copyOf()
        //Using for backup data
        System.out.println("--------------|Array copy()|--------------");
        int[] num6 = Arrays.copyOf(num1, num1.length);
        System.out.println("Copied array: " + Arrays.toString(num6));


        //Array copyOfRange()
        //Using for backup data with range
        System.out.println("--------------|Array copyOfRange()|--------------");
        int[] num0 = {7, 3, 4, 5, 6, 2};
        int[] num7 = Arrays.copyOfRange(num0, 1, 4);
        System.out.println("Copied array with range: " + Arrays.toString(num7));




        //Array binarySearch()
        //Using for search data and update show and delete in array
        System.out.println("--------------|Array binarySearch()|--------------");
        int[] x = {2 ,3, 4, 5, 6, 7};
        int index = Arrays.binarySearch(x, 5);
        System.out.println(index);
        System.out.println(x.length);        
        


          
    }
}

















































