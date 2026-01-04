package OOPonline;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Items> items;
    
    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Items item) {
        items.add(item);
    }

     public void addItem(String name, int quantity, int damage, String type){
        Items newItem = new weapon(type, name, quantity, damage);
        items.add(newItem);
     }

    public void displayInventory() {
        for (Items item : items) {
            System.out.println(item.toString());
        }
    }
} 
