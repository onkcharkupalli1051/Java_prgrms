class Circle{
    double x,y,r;

    double circum(){
        return 2*Math.PI*r;
    }

    double area(){
        return Math.PI*r*r;
    }
}

class Box{
    double width;
    double height;
    double depth;

    double area(){
        return (width*height + height*depth + width*depth)*2;
    }

    double volume(){
        return (width*height*depth);
    }
}

class MultipleClassDeclaration{
    public static void main(String args[]){

        Circle c = new Circle();
        c.x = 6.0; c.y = 5.0; c.r = 9.0;

        Box b = new Box();
        b.depth = 5.0; b.height = 8.0; b.width = 8.0;

        System.out.println("Circumference of c : "+c.circum()+"\tArea of c : "+c.area());
        System.out.println("Area of b : "+b.area()+"\tVolume of b : "+b.volume());

    }
}