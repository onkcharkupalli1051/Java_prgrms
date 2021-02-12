public boolean isInside(Point p){
    double dx = p.x - x;
    double dy = p.y - y;
    double distance = Math.sqrt((dx*dx)*(dy*dy));
    if(distance < r){
        return true;
    }
    else
    {
        return false;
    }
    
    public static void main(String args[]){
        Circle a = new Circle(2.0);
        Point pa = new Point(1.0,2.0);
        pa.display();
        System.out.println("Is the points (1,2) inside the circle with radius 2 : "+a.isInside(pa));
        Circle b = new Circle(1.0);
        Point pb = new Point(1.0,3.0);
        System.out.println("IS the point (3,3) inside the circle with radius 1 : "+b.isInside(pb));
    }
}

