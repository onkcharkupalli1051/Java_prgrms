class Course{
    int courseNumber;
}

public class del{
    public static void RBR_course2(int number_of_people_watching,Course courseNo){
        courseNo.courseNumber += 1;
        number_of_people_watching += 200;
    }

    public static void RBR_course1(){
        int number_of_people_watching = 1000;
        Course course = new Course();
        course.courseNumber = 1;
        RBR_course2(number_of_people_watching,course);
        System.out.println("NOPW : "+number_of_people_watching+" course : "+
                course.courseNumber);
    }
    public static void main(String[] args) {
        RBR_course1();
    }
}