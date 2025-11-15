class Distance {
    double kilometers;
    Distance(double k) {
        kilometers = k;
    }
    Distance toMiles() {
        return new Distance(kilometers * 0.621371);
    }
    void display() {
        System.out.println("Distance: " + kilometers);
    }
}
public class LabExercise17 {
    public static void main(String[] args) {
        Distance d1 = new Distance(10);
        Distance d2 = d1.toMiles();
        d1.display();
        d2.display();
    }
}