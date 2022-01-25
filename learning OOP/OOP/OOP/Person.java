package OOP;

public class Person {
    private String name;
    private int age;
    private String address;
    private String nationallity;

    public void set_age(int a)
    {
        age = a;
    }
    public int get_age()
    {
        return age;
    }
    public void set_adress(String ad)
    {
        address = ad;
    }
    public String get_address()
    {
        return address;
    }
    public void set_nationallity(String n)
    {
        nationallity = n;
    }
    public String get_nationallity()
    {
        return nationallity;
    }
}
