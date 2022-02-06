package OOP;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {  
    // use @override before overriding method from sub to super
    // but final before method name prevent any other method to override it
    // Protected instead of public, able to acces by subclasses but not out of class (between private and public)
    // Abstract Class expect to be overriden and you can't take object from it.
    // method also can be abstract

    // public Interface Retailitem {}
    // public class CD implements Retailitem {}
    // CD must have all methods in RetailItem
    // Can't take object from Interface RetailItem but can from CD (class)
    // CD r1 = new CD();  (true)
    // RetailItem r1 = new CD(); (true) - r1 know methods in RetailItem only not all in CD
    // RetailItem r1 = new RetailItem(); (false)
    // one Class can Implements Multipe Interfaces
    // puplic class MyClass implements Inteface1, Inteface2, Inteface3
    // enum Gender = {Male, Female}
    // Gender stdGender;
    // stdgender = Gender.Male;
    // stdgender = "Female" XX
    // enum methods (compareTo , equals , )
    /* Handling Exception
        try 
        {
            int x=10, y=0;
            System.out.println(x/y);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("error, cannot divied by zero");

        }
        // can use multiple exception
        catch (Exception e)  // Exception is the general class and used for any exception 
        {
            System.out.println(e.getMessege());

        }
    */
    ArrayList<String> list = new ArrayList<String>(); // (10) is default
    list.add("ahmed");
    list.add("mohamed");
    list.add("ali");

    System.out.println(list.size);
    list.remove(1)
    System.out.println(list);
    System.out.println(list.get(2));
    list.add(1, "Saad");
    list.set(3, "ibrahem");
    System.out,println(list);


}
