package javaIntermediate;

class Student {
   public String id; 
   public String name;
   public int age;
   public String gender;
   public String teacher_id;
}
class Schedule {
    public String courseName;
    public String day;
    public String time;
    public String teacherId;
    
    public void displayInfo(){
               System.out.println("Course: " + courseName + ", Day: " + day + ", Time: " + time + ", Teacher ID: " + teacherId);
    }
}
class Teacher {
    public String id;
    public String name;
    public String gender;
    public int age;
    public String email;
    public String phone_number;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Email: " + email + ", Phone number: " + phone_number);
        
    }
}

public class Aaccessing {
    public static void main(String[] args) {
       Student student = new Student();
       Teacher teacher = new Teacher();
       Schedule schedule = new Schedule();

       student.name = "John";
       student.age = 20;
       student.gender = "Male";
       student.id = "12345";
       student.teacher_id = "T001";

       teacher.id = "T001";
       teacher.name = "Tata";
       teacher.age = 35;
       teacher.gender = "Female";
       teacher.email = "kiki@email.com";
       teacher.phone_number = "123-456-7890";

       schedule.courseName = "Mathematics";
       schedule.day = "Monday";
       schedule.time = "10:00 AM";
       schedule.teacherId = "T001";

       System.out.println("Student:");
       System.out.println("ID: " + student.id + ", Name: " + student.name + ", Age: " + student.age + ", Gender: " + student.gender + ", Teacher ID: " + student.teacher_id);

       System.out.println("\nTeacher:");
       teacher.displayInfo();

       System.out.println("\nSchedule :");
       schedule.displayInfo();
    }
}





