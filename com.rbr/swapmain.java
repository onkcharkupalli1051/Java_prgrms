class Double{
    public int x;
}

public class swapmain{
    public static void swap(Double a, Double b)
    {
        Double temp = new Double();
        temp.x = a.x;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Double i = new Double();
        i.x = 10;
        Double j = new Double();
        j.x = 20;
        swap(i,j);
        System.out.println("i : "+i.x+" j : "+j.x);
    }
}
