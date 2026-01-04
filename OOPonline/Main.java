package OOPonline;


class Main {

    public static void main(String[] args) {
        Inventory inventory =  new Inventory();


        Items item1 = new Items("Item1", 5);
        fruit item2 = new fruit("Item2", "apple" ,10);
        weapon item3 = new weapon("Sword", "Sword1", 1, 20);
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        inventory.displayInventory();
        inventory.displayInventory("Male");

        
    }
}