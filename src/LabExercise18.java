class PowerCalculator {
    int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }
}
public class LabExercise18 {
    public static void main(String[] args) {
        PowerCalculator p = new PowerCalculator();
        System.out.println("2^5 = " + p.power(2, 5));
    }
}