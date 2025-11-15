class Countdown {
    void printDown(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printDown(n - 1);
    }
}
public class LabExercise8 {
    public static void main(String[] args) {
        Countdown c = new Countdown();
        c.printDown(5);
    }
}