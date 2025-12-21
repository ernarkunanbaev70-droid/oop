public class Main {
    public static void main(String[] args) {

        ClothingItem cloth = new ClothingItem(10, "Jacket", 12000.0, 6);
        Customer buyer = new Customer(5, "Yernar", 40000.0, 0);

        int pieces = 1;
        double payment = cloth.getPrice();
        payment = payment * pieces;

        cloth.plusQuantity(-pieces);
        buyer.spend(payment);

        System.out.println("amount to pay: " + payment);
        System.out.println("purchase completed");
    }
}
