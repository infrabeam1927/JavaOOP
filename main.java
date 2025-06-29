public class Main{
    public static void main(String[] args){
        System.out.println("Hello world");
        Inventory inventory = new Inventory();
        Item item1= new Item("APPLES",20);
        Item item2= new Item("SWORD",2);
        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.displayInventory();
    }
}