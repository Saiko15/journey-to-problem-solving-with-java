package WelcomeProject;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        char letter;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a letter:");
        letter = reader.next().charAt(0);

        switch (letter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': System.out.println("This is a vowel");
        }
        
        /*
        int choice, num1, num2;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter your choice:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Substract two numbers");
        System.out.println("3. Get the square of the number");
        choice = reader.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("1. Enter two number");
                num1 = reader.nextInt();
                num2 = reader.nextInt();
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println("1. Enter two number");
                num1 = reader.nextInt();
                num2 = reader.nextInt();
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("1. Enter number");
                num1 = reader.nextInt();
                System.out.println(num1 * num1);
                break;
            default:
                System.out.println("Invalid Choice");
        }

        */

        /*
        char grade;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your grade");
        grade = reader.next().charAt(0);

        switch (grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Acceptable");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default :
                System.out.println("Invalid Grade");
             
        }   
        */
        
    }
    
}
