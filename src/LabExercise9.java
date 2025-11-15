class StringReverser {
    void reverse(String s) {
        if (s.length() == 0)
            return;
        reverse(s.substring(1));
        System.out.print(s.charAt(0));
    }
}
public class LabExercise9 {
    public static void main(String[] args) {
        StringReverser r = new StringReverser();
        r.reverse("JAVA");
    }
}