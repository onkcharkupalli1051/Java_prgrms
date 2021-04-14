public class program1 {
    public static void main(String[] args) {
        GradeBook s1 = new GradeBook("CS");
        s1.displayMessage();

        GradeBook s2 = new GradeBook("Entc");
        System.out.printf("s2 : %s ", s2.getCourseName());
    }
}