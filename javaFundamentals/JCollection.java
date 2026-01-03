package javafundamentals;

import java.util.ArrayList;
import java.util.List;

public class JCollection {
    public static void main(String[] args) {
        // Collection example code can be added here
        List<String> name = new ArrayList<>();
        name.add("KIKI");
        name.add("Jeeeje");

        for(String n : name){
            System.out.println(n+ " ");
        }

        System.out.println(name.get(0));
        name.set(1, "Meeeme");
        for (Object n : name) {
            System.out.println(n+ " ");
        }

        name.remove(0);
        for (String n : name){
            System.out.println(n+ " ");
        }
    }
}