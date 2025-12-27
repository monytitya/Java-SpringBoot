package javafundamentals;

public class Ifunction {

    // non-return, non-parameter function
    static void show() {
        System.out.println("Hello non return function");
    }

    // non-return, with parameter function
    static void show1(String word) {
        System.out.println(word);
    }
 
    


    public static void main(String[] args) {
        show(); 
        show1("Hello return java"); // calling parameter function

    }
}
