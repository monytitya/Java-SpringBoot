import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bcrud {
    // Student class to represent our data model
    static class Student {
        private int id;
        private String name;
        private String email;
        private int age;

        public Student(int id, String name, String email, int age) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.age = age;
        }

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    // In-memory storage
    private static List<Student> students = new ArrayList<>();
    private static int nextId = 1;
    private static Scanner scanner = new Scanner(System.in);

    // CREATE operation
    public static void createStudent() {
        System.out.println("\n=== CREATE STUDENT ===");
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student student = new Student(nextId++, name, email, age);
        students.add(student);
        System.out.println("Student created successfully! ID: " + student.getId());
    }

    // READ operation - Get all students
    public static void getAllStudents() {
        System.out.println("\n=== ALL STUDENTS ===");
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // READ operation - Get student by ID
    public static void getStudentById() {
        System.out.println("\n=== GET STUDENT BY ID ===");
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Found: " + student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // UPDATE operation
    public static void updateStudent() {
        System.out.println("\n=== UPDATE STUDENT ===");
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new name (current: " + student.getName() + "): ");
                String name = scanner.nextLine();
                System.out.print("Enter new email (current: " + student.getEmail() + "): ");
                String email = scanner.nextLine();
                System.out.print("Enter new age (current: " + student.getAge() + "): ");
                int age = scanner.nextInt();
                scanner.nextLine(); // consume newline

                student.setName(name);
                student.setEmail(email);
                student.setAge(age);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // DELETE operation
    public static void deleteStudent() {
        System.out.println("\n=== DELETE STUDENT ===");
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Main menu
    public static void displayMenu() {
        System.out.println("\n=== STUDENT CRUD SYSTEM ===");
        System.out.println("1. Create Student");
        System.out.println("2. View All Students");
        System.out.println("3. View Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.print("Choose an option (1-6): ");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Student CRUD System!");

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createStudent();
                    break;
                case 2:
                    getAllStudents();
                    break;
                case 3:
                    getStudentById();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank you for using Student CRUD System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}