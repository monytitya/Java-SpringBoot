package JavaIntermediat;

class User {
    // check data and don't allow invalid data to be set
    private int id;
    private int age;
    private String gender;

    public User(int id, int age, String gender) {
        setId(id);
        setAge(age);
        setGender(gender);
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
            return;
        }
        System.out.println("Invalid ID: must be greater than 0");
    }

    public void setAge(int age) {
        if (age >= 12) {
            this.age = age;
            return;
        }
        System.out.println("Invalid Age: must be 12 or above");
    }

    public void setGender(String gender) {
        if ("Male".equals(gender) || "Female".equals(gender)) {
            this.gender = gender;
            return;
        }
        System.out.println("Invalid Gender: must be Male or Female");
    }
}

public class MainTest {
    public static void main(String[] args) {
        User user = new User(1,15,"male");
        System.out.println("ID: " + user.getId());
        System.out.println("Age: " + user.getAge());
        System.out.println("Gender: " + user.getGender());
        System.out.println("=============||=============");

        user.setAge(12);     
        user.setGender("male");
        user.setAge(10); 
        System.out.println("Age 12 year UP!!!: " + user.getAge());
    }
}
