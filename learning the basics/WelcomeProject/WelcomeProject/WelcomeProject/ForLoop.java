package WelcomeProject;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        int sum=0,grade,counter;
        Scanner input = new Scanner(System.in);

        for (counter=1;counter<=6;counter++)
        {
            System.out.println("Enter a grade of Stedent no. "+ counter);
            grade = input.nextInt();
            sum += grade;

        }
        System.out.println("Sum is: " + sum/6);
        
    }
    
}
