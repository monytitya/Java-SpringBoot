package JavaIntermediat;
class Student {
        private int id;
        public String name;
        public int age;
        public String gender;


        public int getId(){
            return id;
        }

        public void setId(int id){
            if(id <= 0){
                System.out.println("Invalid ID");
                return;
            }
            this.id = id;
        }
    }
public class Accessing {

    public static void main(String[] args) {
        //private use for validation data member and security purpuse
        // private use with getter and setter method
        Student student = new Student();
        student.setId(10);
        System.out.println(student.getId());
    }
}
