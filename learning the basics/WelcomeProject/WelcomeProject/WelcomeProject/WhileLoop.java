package WelcomeProject;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int grade=0, counter=1, sum=0;
        Scanner reader = new Scanner(System.in);

        while (counter<=6)
        {
        System.out.println("Enter grade of studend no" + counter + ":");
        grade = reader.nextInt();
        sum += grade;
        counter++;

        }
        System.out.println("the average is:" + sum/6);
        
    }
    
}
