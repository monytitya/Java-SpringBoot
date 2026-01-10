package javaIntermediate;

class User {
    public String username;
    public String email;
    public int age;

    public void displayUserInfo(){
        System.out.println("Username: " + username + ", Email: " + email + ", Age: " + age);
    }

}
public class Accessing {
    public static void main(String[] args) {
        User user  = new User();

        user.username = "Kiki";
        user.email = "kiki@email.com";
        user.age = 20;
        user.displayUserInfo();
    }
}
