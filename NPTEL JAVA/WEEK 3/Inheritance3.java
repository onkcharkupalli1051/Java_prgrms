import javax.swing.Box;

//initialize subclass object using constructor defined in  
//in superclass

class Box{
    double width, height, depth;

    Box(){
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }

    Box(double w, double x, double y){
        width = w;
        height = x;
        depth = y;
    }

    double Volume(){
        return width*height*depth;
    }
}

class BoxWeight extends Box{
    double weight;
    
    BoxWeight(double w, double h, double d, double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        BoxWeight mybox2 = new BoxWeight(10, 20, 30, 40);
        double vol;
        vol = mybox1.Volume();
        System.out.println("Volume of mybox1 is : "+vol);
        System.out.println();

        vol = mybox2.Volume();
        System.out.println("Volume of mybox2 is : "+vol);
        System.out.println("Weight of mybox2 is : "+mybox2.weight);
    }    
}
