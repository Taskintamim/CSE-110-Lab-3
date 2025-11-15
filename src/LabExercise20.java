class FibonacciSeries {
    int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
public class LabExercise20 {
    public static void main(String[] args) {
        FibonacciSeries f = new FibonacciSeries();
        for (int i = 0; i < 6; i++)
            System.out.print(f.fib(i) + " ");
    }
}