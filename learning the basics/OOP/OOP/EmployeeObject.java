package OOP;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.print_emp(); // default Constructor generated till I create new one
        Employee em1 = new Employee(16, "mo"); // the rest will be defaul (0.0 , 0.0 , false)
        em1.print_emp();

    }
}
