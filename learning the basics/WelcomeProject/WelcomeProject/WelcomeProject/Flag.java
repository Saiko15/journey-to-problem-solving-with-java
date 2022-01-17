package WelcomeProject;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        double sum=0.0, value;
        boolean positive = true;
        Scanner input = new Scanner(System.in);

        while (positive==true)
        {
            System.out.println("Enter the next positive value:");
            value = input.nextDouble();

            if(value>0)
                sum += value;
            else
                positive = false;
        }
        System.out.println("the sum is : " + sum);
    }
    
}
