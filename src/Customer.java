public class Customer {

    private int id;
    private String name;
    private double cash;
    private int purchases;

    public Customer(int id, String name, double cash, int purchases) {
        this.id = id;
        this.name = name;
        this.cash = cash;
        this.purchases = purchases;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getCash() { return cash; }
    public int getPurchases() { return purchases; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCash(double cash) { this.cash = cash; }
    public void setPurchases(int purchases) { this.purchases = purchases; }

    public void spend(double sum) { cash -= sum; purchases++; }
    public boolean canBuy(double sum) { return cash >= sum; }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name=" + name +
               ", cash=" + cash + ", purchases=" + purchases + "}";
    }
}
