//DefaultWithPublicClassInSameFile.java

class A
{
    public int data = 10;
    public void msg()
    {
        System.out.println("Class A: data : "+data);
    }
}

public class DefaultWithPublicClassInSameFile {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}