package JavaIntermediat;
    //Constructor is a special method that is Anizaly to data members of class4
    //Constructor have two types is Default constructor and Parameterized   

    class User implements AutoCloseable {
        public int id;
        public String name;

        User() {
            this.id = 0;
            this.name = "Unkown";
        }
        //Constructor with parameters
        User(int id, String name)   {
            this.id =id;
            this.name = name;
        }

        //Destructor
        @Override
        public void close(){
            System.out.println("Resource closed");
        }
    }   
public class Cconstructor {
    public static void main(String[] args) {
    User user = new User(1,"John");
    System.out.println(user.id +" " +user.name);
    user.close();    
    }
}
