class Double{
    public int x;

    Double DoubleIt(){
        Double temp = new Double();
        temp.x = 2*x;
        return temp;
    }
}

public class del{
    public static void main(String[] args) {
        Double i = new Double();
        i.x = 10;
        Double d = i.DoubleIt();
        System.out.println("D: "+d.x);
    }
}