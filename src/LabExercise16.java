class CartItem {
    String name;
    double price;
    int quantity;
    CartItem(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }
    void increaseQuantity(int q) {
        quantity += q;
    }
    double calculateTotal() {
        return price * quantity;
    }
}
public class LabExercise16 {
    public static void main(String[] args) {
        CartItem c = new CartItem("Laptop", 75000, 1);
        c.increaseQuantity(1);
        System.out.println("Total price for " + c.name + ": " + c.calculateTotal());
    }
}