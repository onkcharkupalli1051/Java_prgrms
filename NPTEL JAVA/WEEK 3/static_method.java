import java.lang.Thread.State;
import java.lang.annotation.Retention;

public class Circle{
    public double x,y,r;

    public Circle bigger(Circle C){
        if(c.r>r){
            return c.r;
        }
        else{
            return this;
        }
    }

    public static Circle bigger(Circle a, Circle b){
        if(a.r > b.r){
            return a;
        }
        else{
            return b;
        }
    }


public static void main(String args[]){
    Circle a = new Circle(2.0);
    Circle b = new Circle(3.0);
    Circle c = a.bigger(b);
    Circle d = Circle.bigger(a,b);
}
}