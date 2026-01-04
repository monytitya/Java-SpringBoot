package javaIntermediate;
    //Class
class Student{
        //Data Members
        public String name;
        public int age;

        //Function Members
        //void means non return type function
        public void displayInfo(){
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }   

public class Enscaptulation {
    public static void main(String[] args) {
        //void eqaul non return function
        //Object is a scpail variable
        Student student1 = new Student();

        student1.name = "KIKI";
        student1.age = 21;
        student1.displayInfo(); 
    }
}
