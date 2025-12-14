package javaFundamentals;

public class Comparetion {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b){
            System.out.println("Is wrong");
        } else {
            System.out.println("B is correct");
        }
        System.out.println("==============================");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b :" + (a != b));
        System.out.println("a >= b :" +(a >= b));
        System.out.println("a <= b :" + (a <= b));      
    }
}
