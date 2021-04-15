package sample;

class RBRCourse{
    String courseName;
    int lectures;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        RBRCourse[] courses;
        courses = new RBRCourse[3];

        courses[0] = new RBRCourse();
        courses[0].courseName = "Java";
        courses[0].lectures = 20;

        courses[1] = new RBRCourse();
        courses[1].courseName = "Linux";
        courses[0].lectures = 5;

        courses[3] = new RBRCourse();
        courses[2].courseName = "Web";
        courses[2].lectures = 5;

        for(int i=0;i< courses.length;i++){
            System.out.println(courses[i].courseName + " "+ courses[i].lectures);
        }
    }
}