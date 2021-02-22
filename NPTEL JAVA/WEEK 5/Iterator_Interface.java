package java.util.*;

public interface Iterator_Interface {
    public abstract boolean hasNext();
    Object next();
    void remove();
}

myShapes = getSomeCollectionOfShapes();
Iterator iter = myShapes.Iterator();
while(iter.hasNext())
        {
            Shape s = (Shape)iter.next();
            s.draw();
        }
