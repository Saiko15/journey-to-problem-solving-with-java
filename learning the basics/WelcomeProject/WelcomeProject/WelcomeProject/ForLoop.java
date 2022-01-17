package WelcomeProject;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {


        
        int number; // if factorial was here, it will multiple with the before number so it should be inside.
        Scanner input = new Scanner(System.in);
        for (int j=1;j<=5;j++)
        {
            System.out.println("Enter a number that you want its factorial");
            int factorial=1;
            number = input.nextInt();
            for (int i=1; i<=number;i++)
            {
                factorial *= i;
            }
            System.out.println("Factorial is : " + factorial);
        }









        // int number, factorial=1;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number that you want its factorial");

        // number = input.nextInt();
        // for (int i=1; i<=number;i++)
        // {
        //     factorial *= i;
        // }
        // System.out.println("Factorial is : " + factorial);




        /*
        int sum=0,grade,counter;
        Scanner input = new Scanner(System.in);

        for (counter=1;counter<=6;counter++)
        {
            System.out.println("Enter a grade of Stedent no. "+ counter);
            grade = input.nextInt();
            sum += grade;

        }
        System.out.println("Sum is: " + sum/6);
*/
        /*
            for (int i=0; i<=10; i++)
                System.out.println(i);
            ------------------
            for (int i=0; i<=10; i+=2) // Even
                System.out.println(i);
            ------------------
            for (int i=1; i<=10; i+=2) // Odd
                System.out.println(i);
            ------------------
            for (int i=10; i>=0; i--) // decrement
                System.out.println(i);
            ------------------
        */
        
    }
    
}
