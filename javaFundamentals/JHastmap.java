package javafundamentals;

import java.util.HashMap;
import java.util.Map;

public class JHastmap {
    public static void main(String[] args) {
        // hashmap
        // Map<String, Integer> studeMap = new java.util.HashMap<>();
        // studeMap.put("Nita", 90);
        // studeMap.put("Bopha",   80);
        // System.out.println(studeMap);
        //View value by key
        // System.out.println("Total students: " + studeMap.size());
        Map<String, String> studeMap = new HashMap<>();
        studeMap.put("id","007");
        studeMap.put("name",   "BunLeap");
        studeMap.put("skill",   "Eating");
        studeMap.put("topskill",   "sleeping");

        System.out.println(studeMap);
    }
}


