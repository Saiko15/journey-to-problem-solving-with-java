package OOP;

public class Employee {
    int emp_id;
    String emp_name;
    String department;
    double salary;
    double bonus;
    boolean residant;
    
    public Employee()
    {
        emp_id = 100;
        emp_name = "ah";
        salary = 3000;
        bonus = 500;
        residant = true;
    }

    public Employee(int id, String name)
    {
        emp_id = id;
        emp_name = name; // cannot be name = emp_name
    }
    public Employee(int id, String name, boolean res)
    {
        this(id, name); // this refer to currrent object
        residant = res;
    }
    public Employee(int id, String name, String deprt, double s, double b, boolean res)
    {
        this(id, name, res);
        department = deprt;
        salary = s;
        bonus = b; 
       
    }

    public void print_emp ()
    {
        System.out.println(emp_id);
        System.out.println(emp_name);
        System.out.println(salary);
        System.out.println(bonus);
        System.out.println(residant);
    }
}

