class RectangleTool {
    int area(int side) {
        return side * side;
    }
    int area(int length, int width) {
        return length * width;
    }
    int perimeter(int length, int width) {
        return 2 * (length + width);
    }
}
public class LabExercise14 {
    public static void main(String[] args) {
        RectangleTool r = new RectangleTool();
        System.out.println("Square area: " + r.area(5));
        System.out.println("Rectangle area: " + r.area(4, 6));
        System.out.println("Rectangle perimeter: " + r.perimeter(4, 6));
    }
}