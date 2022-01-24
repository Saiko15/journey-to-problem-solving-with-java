package OOP;

public class Rectangle {
    private double length; 
    public double width; // should be private ,, but this only for practice 

    public Rectangle(){}
    public Rectangle (double l, double w)
    {
        length = l;
        width = w;
    }
    public void modifyingobject(Rectangle r)
    {
        length = 96;
        width = 98;
    }
    public void setlength (double l) // Setter, Mutator
    {
        length = l;
    }
    public void setwidth (double w)
    {
        width = w;
    }
    public double getlength() // Getter, Accessor
    {
        return length;
    }
    public double getwidth()
    {
        return width;
    }
    public double getarea()
    {
        return length*width;
    }
}
