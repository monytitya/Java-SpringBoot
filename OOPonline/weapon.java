package OOPonline;

public class weapon extends Items {
    private int damage;
    private String type;



    public weapon(String type, String name, int quantity, int damage){
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public int getDamage(){
        return damage;
    }

}
