package WelcomeProject;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        
      int guess, rand;
      rand = (int)(Math.random()*100); // int because random generates douples, *100 because it'll from 0 to 1
      System.out.println("the random number is: "+ rand);
    
      boolean stillplaying = true;
      Scanner input= new Scanner(System.in);

      while (stillplaying== true)
      {
          System.out.println("Guess a number:");
          guess = input.nextInt();

          if (guess > rand)
            System.out.println("Guess is too large");
          else if (guess < rand)
            System.out.println("Guess is too small");
          else 
          {
            System.out.println("You win!");
            stillplaying = false;
          }
      }

      
      
        /* double sum=0.0, value;
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
        */
    }
    
}
