public class Sale {

    private int saleId;
    private ClothingItem item;
    private int count;
    private double total;

    public Sale(int saleId, ClothingItem item, int count) {
        this.saleId = saleId;
        this.item = item;
        this.count = count;
        this.total = item.getPrice() * count;
    }

    public double getTotal() {
        return total;
    }
}
