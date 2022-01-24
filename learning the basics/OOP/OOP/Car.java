package OOP;

import java.lang.module.ModuleFinder;

public class Car {
    private String maker;
    private int model;

    public void setmaker (String m)
    {
        maker = m;
    }
    public void setmodel (int year)
    {
        model = year;
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
