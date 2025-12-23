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

    public int getSaleId() { return saleId; }
    public ClothingItem getItem() { return item; }
    public int getCount() { return count; }
    public double getTotal() { return total; }

    public void setSaleId(int saleId) { this.saleId = saleId; }
    public void setItem(ClothingItem item) { this.item = item; }
    public void setCount(int count) { this.count = count; total = item.getPrice() * count; }

    public void recalc() { total = item.getPrice() * count; }
    public boolean isBigSale() { return total > 20000; }

    @Override
    public String toString() {
        return "Sale{id=" + saleId + ", item=" + item.getName() +
               ", count=" + count + ", total=" + total + "}";
    }
}
