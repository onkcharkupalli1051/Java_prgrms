class Circle{
    double x,y,r;

    double circum(){
        return 2*Math.PI*r;
    }

    double area(){
        return Math.PI*r*r;
    }

    //Constructor
    Circle(double a, double b, double c){
        x=a;
        y=b;
        r = c;
    }
}

class Constructor1{
    public static void main(String args[]){
        Circle C1 = new Circle(7,8,9);
        Circle C2 = new Circle(4,5,6);

        System.out.println("Circumference of C1 : "+C1.circum()+", Area of C1 : "+C1.area());
        System.out.println("Circumference of C2 : "+C2.circum()+", Area of C2 : "+C2.area());

    }
}
