public class item{
    private String name;
    private int quantity;

    public item(String name, int quantity){
        this.name = name;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
}
