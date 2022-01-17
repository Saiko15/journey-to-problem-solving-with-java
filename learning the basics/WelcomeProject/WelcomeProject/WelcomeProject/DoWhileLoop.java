package WelcomeProject;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
    
    int value, num1=20, num2=40;
    Scanner input = new Scanner(System.in);

    do 
    {
        System.out.println("Choose one of these choices.");
        System.out.println("1. Sum two numbers");
        System.out.println("2. Substract two numbers");
        System.out.println("3. Divide two numbers");
        System.out.println("4. Multiple two numbers");
        System.out.println("0. Exit");

        value = input.nextInt();

        switch (value)
        {
            case 1: 
                System.out.println(num1 + num2);
                break;
            case 2: 
                System.out.println(num2 - num1);
                break;
            case 3: 
                System.out.println(num2/num1);
                break;
            case 4: 
                System.out.println(num1*num2);
                break;
            case 0:
                System.out.println("Good bye");
                break;
            default:
                System.out.println("Invalid Option");


        }



    }
    while(value!=0);
    
    
    
    
    
    
    
    
        //     int grade=0, counter=1, sum=0;
    //     Scanner reader = new Scanner(System.in);

    //    do
    //     {
    //     System.out.println("Enter grade of studend no" + counter + ":");
    //     grade = reader.nextInt();
    //     sum += grade;
    //     counter++;

    //     }  while (counter<=6);
    //     System.out.println("the average is:" + sum/6);
    }
    
}
