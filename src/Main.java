public class Main {
    public static void main(String[] args) {

        
        ClothingItem cloth = new ClothingItem(1, "Jacket", 12000, 6);
        Customer buyer = new Customer(1, "Yernar", 40000, 0);

        System.out.println("Initial state:");
        System.out.println("Item: " + cloth.getName() +  ", price: " + cloth.getPrice() + ", quantity: " + cloth.getQuantity());
        System.out.println("Customer: " + buyer.getName() + ", cash: " + buyer.getCash() + ", purchases: " + buyer.getPurchases());
                            
        Sale sale = new Sale(1, cloth, 2);

        cloth.plusQuantity(-sale.getCount());
        buyer.spend(sale.getTotal());

        System.out.println("After sale:");
        System.out.println("Item quantity: " + cloth.getQuantity());
        System.out.println("Customer cash: " + buyer.getCash());
        System.out.println("Total paid: " + sale.getTotal());
    }
}
