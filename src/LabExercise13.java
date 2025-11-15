class Books {
    String title, author;
    double price;
    Books() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }
    Books(String t, String a) {
        title = t;
        author = a;
        price = 500;
    }
    Books(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void showInfo() {
        System.out.println(title + " by " + author + " - $" + price);
    }
}
public class LabExercise13 {
    public static void main(String[] args) {
        Books b1 = new Books();
        Books b2 = new Books("Clean Code", "Robert C. Martin");
        Books b3 = new Books("Effective Java", "Joshua Bloch", 1200);
        b1.showInfo();
        b2.showInfo();
        b3.showInfo();
    }
}