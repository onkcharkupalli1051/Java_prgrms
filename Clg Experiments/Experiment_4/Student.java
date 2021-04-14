public class Student  {
    private String name;
    private String address;
    private int rollno;
    private float percentage;

    public Student(String name, String address, int rollno, float percentage) {
        this.name = name;
        this.address = address;
        this.rollno = rollno;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public void display(){
        System.out.printf("Name : %s\nAddress : %s\nRollno : %d\n" +
                "Percentage : %f",name,address,rollno,percentage);
    }
}


