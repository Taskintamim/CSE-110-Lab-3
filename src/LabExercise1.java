class ShapeArea {
    double area(double radius) {
        return 3.1416 * radius * radius;
    }
    double area(double length, double width) {
        return length * width;
    }
    double area(int base, int height) {
        return 0.5 * base * height;
    }
}
public class LabExercise1 {
    public static void main(String[] args) {
        ShapeArea s = new ShapeArea();
        System.out.println("Circle area: " + s.area(5.0));
        System.out.println("Rectangle area: " + s.area(4.5, 3.0));
        System.out.println("Triangle area: " + s.area(5, 8));
    }
}