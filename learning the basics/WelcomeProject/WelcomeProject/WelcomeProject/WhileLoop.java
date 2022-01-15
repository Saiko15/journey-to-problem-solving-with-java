package WelcomeProject;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int grade=0, counter=1, sum=0;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter grades or -1 to exit");
        while (counter<=6 && grade!= -1)
        {
            grade = reader.nextInt();
            sum += grade;
            counter ++;
        }
        if ( sum != -1)
        System.out.println("Sum is : " + sum);
        else System.out.println("Closed");
      
        /*
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
        */
    }
    
}
