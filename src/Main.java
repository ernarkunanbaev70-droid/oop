public class Main {
    public static void main(String[] args) {

        ClothingItem cloth = new ClothingItem(1, "Jacket", 12000, 6);
        Customer buyer = new Customer(1, "Yernar", 40000, 0);

        Sale sale = new Sale(1, cloth, 2);

        cloth.plusQuantity(-2);
        buyer.spend(sale.getTotal());

        System.out.println(cloth);
        System.out.println(buyer);
        System.out.println(sale);
    }
}
