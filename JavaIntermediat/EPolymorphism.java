package JavaIntermediat;
class Math{
    static public void Calculate(){
        System.out.println("No number");
    }
    static public void Calculate(int a, int b){
        System.out.println(a + b);
    }
    static public void Calculate(float a, float b){
        System.out.println(a + b);
    }
}

public class EPolymorphism {
    public static void main(String[] args) {
        Math.Calculate();
        Math.Calculate(1.4f,3.14f);
        Math.Calculate(1, 2);
    }
}
