package OOP;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee em = new Employee();
        //em.print_emp(); // default Constructor generated till I create new one
        Employee em1 = new Employee(16, "mo"); // the rest will be defaul (0.0 , 0.0 , false)
        //em1.print_emp();
        Employee em2 = new Employee(18, "yo", true);
        //em2.print_emp();
        Employee em3 = new Employee(20, "saiko", "IT", 5000, 800, false);
        em3.print_emp();
        em3.set_salary(7000, 1000);
        em3.print_emp();
        System.out.println(Employee.get_no_of_objects());
        System.out.println(Calc.add(6, 8)); // use it diriect without create objects every time (for utility classes like Math)

        

    }
}
