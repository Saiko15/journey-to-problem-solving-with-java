package OOP;

import java.lang.module.ModuleFinder;

public class Car {
    private String maker;
    private int model;

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
