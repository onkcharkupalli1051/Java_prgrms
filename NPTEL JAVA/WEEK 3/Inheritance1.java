//Simple inheritance
class Point2D{
    int x,y;
    void display(){
        System.out.println(x,y);
    }
}

class Point3D extends Point2D{
    int z;
    void display(){
        System.out.println(x,y,z);
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        // Point2D new P1();
        // Point3D new P2();
        Point2D P1 = new Point2D();
        Point3D P2 = new Point3D();
        P1.x = 10;
        P1.y = 20;
        System.out.println("Point2D P1 is "+P1.display());
        P2.x = 100;
        P2.y = 200;
        P2.z = 300;
        System.out.prinln("Point3D P2 is "+P2.display());
    }
}
