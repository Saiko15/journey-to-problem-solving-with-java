package WelcomeProject;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int a;
        System.out.println("type a number");
        a = number.nextInt();

        if (a % 2 ==0) // one statement
            System.out.println("Even number");
        else
            System.out.println("Odd number");

        // #################        

        if (a > 0)
        {                 //  compound statement
            System.out.println("Positive number");
            System.out.println("try another number");
        }
        else
            System.out.println("Negative number");

        // ###############

        if (a > 0)           //  nested if
        {       
            System.out.println("Positive number");
            if ( a % 2 ==0)
                System.out.println("Even number");
            else 
                System.out.println("Odd number");
        }
        else
            System.out.println("Negative number");

        // ###############

        if (a >= 90 && a <= 100) // multi way statement , Anding & Oring
            System.out.println("A")
        else if
            System.out.println("A")
    }
    
}
