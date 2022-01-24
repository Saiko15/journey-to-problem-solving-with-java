package OOP;


public class Car {
    private String maker;
    private int model;

    public Car ()                       // Constructor have the same name of the class
    {                                       // have no return type (not even void)
        maker = "bmw";                  // may not return any values
        model = 2010;                   // are typically public 
        System.out.println("Hi"); 

    }
    public Car (String n, int y)      // Constructor Overloading
    {
        maker = n;
        model = y;
    }

    public void setmaker (String m)
    {
    if(m == "bmw"|| m== "mercedes" || m== "audi")
        maker = m;
    else
        System.out.println("Invalid Maker");
    }
    public void setmodel (int year)
    {
    if (year>1999) // not accept models under 2000 && also to not accept negative numbers
        model = year;
    else
        System.out.println("Invalid Model");
    }
    public String getmaker()
    {
        return maker;
    }
    public int getmodel()
    {
        return model;
    }
}
