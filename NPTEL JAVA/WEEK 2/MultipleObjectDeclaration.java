class Circle{
    double x,y,r;

    double circum(){
        return 2*Math.PI*r;
    }

    double area(){
        return Math.PI*r*r;
    }
}

class MultipleObjectDeclaration{
    public static void main(String args[]){
        Circle C1 = new Circle();
        Circle C2 = new Circle();

        C1.x = 3.0;
        C1.y = 5.0;
        C1.r = 5.0;

        C2.x = 4.0;
        C2.y = 6.0;
        C2.r = 9.0;

        System.out.println("Circumference of C1 : "+C1.circum()+", Area of C1 : "+C1.area());
        System.out.println("Circumference of C2 : "+C2.circum()+", Area of C2 : "+C2.area());
    }
}