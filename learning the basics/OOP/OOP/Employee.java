package OOP;

public class Employee {
    int emp_id;
    String emp_name;
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

    public void print_emp ()
    {
        System.out.println(emp_id);
        System.out.println(emp_name);
        System.out.println(salary);
        System.out.println(bonus);
        System.out.println(residant);
    }
}

