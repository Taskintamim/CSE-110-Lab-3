class Temperature {
    double celsius;
    Temperature(double c) {
        celsius = c;
    }
    Temperature toFahrenheit() {
        return new Temperature((celsius * 9 / 5) + 32);
    }
    void show() {
        System.out.println("Temperature: " + celsius);
    }
}
public class LabExercise7 {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(25);
        Temperature t2 = t1.toFahrenheit();
        t1.show();
        t2.show();
    }
}