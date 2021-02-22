public class Car implements Serializable
{
    //rest of class unaltered
}

import java.io.*;
public class Serialization
{
    Car myToyota, anotherToyota;
    myToyota = new Car("Toyota","Carina",42312);
    ObjectOutputStream out = getOutput();
    out.writeObject(myToyota);
    ObjectInputStream in = getInput();
    anotherToyota = (Car)in.readObject();
}