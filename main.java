public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");
        Inventory inventory = new Inventory();
        //Item item1= new Item("APPLES",20);
        Item item2= new Item("Generic item",2);
        Fruit fruit = new Fruit("Fuji","Apple",20);
        // inventory.addItem(item1);
        inventory.addItem(fruit);
        inventory.addItem(item2);
        inventory.displayInventory();
    }
}