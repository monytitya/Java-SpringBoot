package javafundamentals;

public class Ireturnfunc {
    static void myMethod()
        {
           System.out.println("Hello world!");
        }

    static void customerErr()
    {
        System.out.println("Here is an error message from that's function");
    }

    static int myNum(int number)
    {
        return  number;
    }

    public static void main(String[] args) {
        myMethod();
        customerErr();
        myNum(5 + 9); 
    }
}

