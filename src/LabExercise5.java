class Calculator {
    void increment(int x) {
        x = x + 1;
        System.out.println("Inside method: " + x);
    }
}
public class LabExercise5 {
    public static void main(String[] args) {
        int a = 10;
        Calculator c = new Calculator();
        c.increment(a);
        System.out.println("After call: " + a);
    }
}