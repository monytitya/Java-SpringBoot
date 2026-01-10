package javaIntermediate;
    //Class
class Student{
        //Data Members - Encapsulated with private access
        private String name;
        private int age;

        //Getter and Setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //Function Members
        //void means non return type function
        public void displayInfo(){
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }   

public class Encapsulation {
    public static void main(String[] args) {
        //void equal non return function
        //Object is a special variable
        Student student1 = new Student();

        student1.setName("KIKI");
        student1.setAge(21);
        student1.displayInfo(); 
    }
}

