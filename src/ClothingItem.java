public class ClothingItem {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public ClothingItem(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void plusQuantity(int x) {
        quantity += x;
    }
}
