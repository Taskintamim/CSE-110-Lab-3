class Book {
    String title;
    double price;
    Book(String t, double p) {
        title = t;
        price = p;
    }
    Book(Book b) {
        title = b.title;
        price = b.price;
    }
    void display() {
        System.out.println(title + " - $" + price);
    }
}
public class LabExercise4 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 950);
        Book b2 = new Book(b1);
        b1.display();
        b2.display();
    }
}