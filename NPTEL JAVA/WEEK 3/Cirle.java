public class Circle {
    int circlecount = 0;
    public double x,y,r;
    public Circle(double x, double y, double r){
        this.x = x;this.y =y; this.y = y;
        circlecount++;
    }

    public Circle(double r)
    {
        this(0.0,0.0,r);
        circlecount++;
    }

    public Circle(Circle c){
        this(c,x,c.y,c.r);
        circlecount++;
    }

    public double circumference(){
        return (2*3.14*r);
    }

    public double area(){
        return (3.14*r*r);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1#"+c1.circlecount);

        Circle c2 = new Circle(5.0);
        System.out.println("c2#"+c2.circlecount);
    }
}
