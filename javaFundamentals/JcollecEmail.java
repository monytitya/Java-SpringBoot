package javafundamentals;
import java.util.HashSet;
import java.util.Set;

public class JcollecEmail {
    public static void main(String[] args) {
        //hashset 
        Set<String> emails = new HashSet<>();
        emails.add("Nita@gmail.com");
        emails.add("Bopha@gmail.com");
     

        System.out.println(emails);
        System.out.println("\nTotal unique emails:" + emails.size());
    }
}



