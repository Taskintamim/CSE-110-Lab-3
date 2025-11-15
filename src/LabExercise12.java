class Employee {
    String name;
    double baseSalary, bonus;
    Employee(String n, double s, double b) {
        name = n;
        baseSalary = s;
        bonus = b;
    }
    double calculateSalary() {
        return baseSalary + bonus;
    }
}
public class LabExercise12 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tamim", 30000, 2000);
        Employee e2 = new Employee("Anik", 28000, 2500);
        System.out.println(e1.name + " Salary: " + e1.calculateSalary());
        System.out.println(e2.name + " Salary: " + e2.calculateSalary());
    }
}