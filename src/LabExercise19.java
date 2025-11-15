class GradeReport {
    private int[] marks;
    GradeReport(int[] m) {
        marks = m;
    }
    double calculateAverage() {
        int sum = 0;
        for (int x : marks)
            sum += x;
        return (double) sum / marks.length;
    }
    char findGrade() {
        double avg = calculateAverage();
        if (avg >= 80) return 'A';
        else if (avg >= 60) return 'B';
        else return 'C';
    }
}
public class LabExercise19 {
    public static void main(String[] args) {
        int[] scores = {75, 80, 90, 85};
        GradeReport g = new GradeReport(scores);
        System.out.println("Average: " + g.calculateAverage());
        System.out.println("Grade: " + g.findGrade());
    }
}