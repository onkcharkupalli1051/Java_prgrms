class Point2D{
    int x,y;

    Point2D(int a, int b){
        x = a;
        y = b;
    }

    void display(){
        System.out.println(x,y);
    }
}

class Point3D extends Point2D{
    int z;

    Point3D(int c){
        z = c;
    }

    void display(){
        System.out.println(x,y,z);
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        Point2D p = new Point2D(3.0, 4);
        p.display();

        Point3D q = new Point3D(5);
        q.display();

        Point2D x = (Point2D) q;  //Cast q to an instance of class POint2D
        x.display();
    }    
}
