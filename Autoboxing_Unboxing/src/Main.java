import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> myIntegerValues = new ArrayList<Integer>();
//        for(int i=0;i<10;i++){
//            myIntegerValues.add(Integer.valueOf(i));
//        }
//
//        for(int i=0;i<myIntegerValues.size();i++){
//            System.out.println(myIntegerValues.get(i).intValue());
//        }

//        Integer i = new Integer(10);
//        System.out.println(i);

        Integer x = 100;
        System.out.println(x);

        ArrayList<Double> myDoublelist = new ArrayList<>();
        for(double i=0.0; i<10; i++){
            myDoublelist.add(Double.valueOf(i));
        }

        for(int i=0; i<10; i++){
            System.out.println(i + " -> "+ myDoublelist.get(i).doubleValue());
        }
    }
}
