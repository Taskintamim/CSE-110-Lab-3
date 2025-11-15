class Product {
    String name;
    double price;
    Product(String n, double p) {
        name = n;
        price = p;
    }
    void updatePrice(Product p) {
        p.price = p.price + 50;
    }
}
public class LabExercise6 {
    public static void main(String[] args) {
        Product p1 = new Product("Keyboard", 850);
        p1.updatePrice(p1);
        System.out.println("Updated price: " + p1.price);
    }
}