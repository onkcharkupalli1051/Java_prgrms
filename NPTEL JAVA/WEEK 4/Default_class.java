//Default class modifier

class A
{
    void msg()
    {
        System.out.println("HI. This is Class A");
    }
}

class Default_class
{
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}