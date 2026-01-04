package OOPonline;

public class Items {
    private  String name;
    private int quantity;


    //constructor
    public Items(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    
    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
