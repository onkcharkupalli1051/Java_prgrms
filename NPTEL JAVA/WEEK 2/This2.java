class Circle{
    double x,y,r;

    double circum(){
        return 2*Math.PI*r;
    }

    double area(){
        return Math.PI*r*r;
    }

    //Constructor
    Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    Circle(double r)
    {
        this(0.0,0.0,r);
    }

    Circle(Circle c)
    {
        this(c.x,c.y,c.r);
    }

    Circle(){
        this(0.0,0.0,0.0);
    }
}

class Constructor1{
    public static void main(String args[]){
        Circle C1 = new Circle(7,8,9);
        Circle C2 = new Circle(4,5,6);

        System.out.println("Circumference of C1 : "+C1.circum()+", Area of C1 : "+C1.area());
        System.out.println("Circumference of C2 : "+C2.circum()+", Area of C2 : "+C2.area());

        Circle C3 = new Circle(6.0);
        System.out.println("Circumference of C3 : "+C3.circum()+", Area of C3 : "+C3.area());

        Circle C4 = new Circle(C1);
        System.out.println("Circumference of C4 : "+C4.circum()+", Area of C4 : "+C4.area());
    }
}
