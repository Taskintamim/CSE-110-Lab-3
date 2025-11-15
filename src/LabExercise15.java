class Ticket {
    String eventName;
    int seatNo;
    double price;
    Ticket(String e, int s, double p) {
        eventName = e;
        seatNo = s;
        price = p;
    }
    void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }
    void display() {
        System.out.println(eventName + " | Seat " + seatNo + " | Price: " + price);
    }
}
public class LabExercise15 {
    public static void main(String[] args) {
        Ticket t = new Ticket("Spider Man No Way Home", 105, 2000);
        t.applyDiscount(10);
        t.display();
    }
}