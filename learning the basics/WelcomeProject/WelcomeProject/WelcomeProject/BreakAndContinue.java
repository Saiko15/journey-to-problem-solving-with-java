package WelcomeProject;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        
        int sum=0, counter=1, num;
        Scanner input= new Scanner(System.in);
        while (counter <= 6)
        {
            System.out.println("enter number " + counter);
            num = input.nextInt();
            if (num < 0)
            {
                System.out.println("you can't enter negative value");
                continue;
            }
            sum += num;
            counter++;

        }
        System.out.println("Sum is: " +sum);
        
        
        
        // int sum=0, counter=1, num;
        // Scanner input= new Scanner(System.in);
        // while (counter <= 6)
        // {
        //     System.out.println("enter number " + counter);
        //     num = input.nextInt();
        //     if (num < 0)
        //     {
        //         System.out.println("you can't enter negative value");
        //         break;
        //     }
        //     sum += num;
        //     counter++;

        // }
        // System.out.println("Sum is: " +sum);
        
    }
    
}
