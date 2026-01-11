package JavaIntermediat;
   //Inheritance objective for make code to cline and reusable
    class Model {
       public String model;
       private int id;

       Model(){
        model = "No model";
        id = 0;
       }
       public void setId(int id){
        if(id <= 0){
            System.out.println("Invalide id");
            return;
        }
        this.id = id;
       }
       public int getId(){
           return id;
       }

    }
    class Cars extends Model {
        public String name;
        public float price;

        Cars(){
            super();
            name = "No name";
            price = 0;

        }
        public void Display(){
            System.out.println("ID :" + getId());
            System.out.println("Name : " + this.name);
            System.out.println("Price : " + this.price);
            System.out.println("Model :" + this.model);
        }
    }
 
public class DInheritance {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.setId(1);
        car.name = "Lambo";
        car.price = 3000;
        car.model = "Royllo yoo";
        car.Display();
    }
}
