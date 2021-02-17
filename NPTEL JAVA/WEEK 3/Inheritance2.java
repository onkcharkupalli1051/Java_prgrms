class A{
    int i,j;
    void showij(){
        System.out.println("i and j : "+i+" "+j);
    }
}

class B extends A{
    int k;

    void showk(){
        System.out.println("K: "+k);
    }

    void sum(){
        System.out.println("i+j+k : "+(i+j+k));
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        A superob = new A();
        B subOb = new B();

        superob.i = 10;
        superob.j = 20;
        superob.showij();
        System.out.println();

        subOb.i = 100;
        subOb.j = 200;
        subOb.k = 300;
        subOb.showk();
        subOb.sum();
    }
}
