public class Car implements Cloneable
{
    private String make;
    private String model;
    private double price;
    public Car()
    {
        this("","",0.0);
    }

    public Car(String make, String model, double price)
    {
        this.make = make;
        this.model = model;
        this.price = price;
    }
    public Object clone()
    {
        return new Car(this.make, this.model, this.price);
    }
}