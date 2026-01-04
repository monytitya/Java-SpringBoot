package OOPonline;

public class fruit extends Items {
    private String type;

    public fruit(String type, String name, int quantity) {
        super(name, quantity);
        this.type = type;

    }

    public String getType() {
        return type;
    }
    
}
