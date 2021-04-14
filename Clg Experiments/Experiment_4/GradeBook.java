public class GradeBook{
    private String courseName;

    public GradeBook(String name)
    {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayMessage(){
        System.out.println("CourseName : "+courseName);
    }
}
