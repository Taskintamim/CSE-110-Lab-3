class Student {
    String name;
    int id;
    double cgpa;
    Student() {
        name = "Unknown";
        id = 0;
        cgpa = 0.0;
    }
    Student(String n, int i) {
        name = n;
        id = i;
        cgpa = 3.0;
    }
    Student(String n, int i, double c) {
        name = n;
        id = i;
        cgpa = c;
    }
    void display() {
        System.out.println(id + " - " + name + " - " + cgpa);
    }
}
public class LabExercise2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Taskin", 101);
        Student s3 = new Student("Tamim", 102, 3.85);
        s1.display();
        s2.display();
        s3.display();
    }
}