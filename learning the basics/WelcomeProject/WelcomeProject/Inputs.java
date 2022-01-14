package WelcomeProject;

import java.util.Scanner;

public class Inputs {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name="";
        float salary, net_salary;

        System.out.println("Enter your name");
        name = input.next();

        System.out.println("Enter your salary");
        salary = input.nextFloat();

        net_salary = salary - (salary * 0.10f);
        System.out.printf("Your net salary is %f", net_salary);



    }
    
}
