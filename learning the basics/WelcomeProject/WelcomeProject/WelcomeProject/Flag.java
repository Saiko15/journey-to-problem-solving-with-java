package WelcomeProject;


public class Flag {
    public static void main(String[] args) {
      // it needs some mathematical maintainance  
      int guess = 50, rand;
      rand = (int)(Math.random()*100); // int because random generates douples, *100 because it'll from 0 to 1
      System.out.println("the random number is: "+ rand);
    
      boolean stillplaying = true;

      while (stillplaying== true)
      {
          System.out.println("I guessed" +guess+ ". Is it true?");

          if (guess > rand)
          {
            System.out.println("No, your guess is too large");
            guess = 25;
          }
          else if (guess < rand)
          {
            System.out.println("No, your guess is too small");
            guess = 75;
          }
          else 
          {
            System.out.println("You win!");
            stillplaying = false;
          }

      }
    
        /*
        int guess, rand;
        guess = (int)(Math.random()*100); // int because random generates douples, *100 because it'll from 0 to 1
        boolean stillplaying = true;

        
        Scanner input= new Scanner(System.in);

        System.out.println("What is your random number?");
        rand = input.nextInt();

        while (stillplaying == true)
        {
            System.out.println("the random number is: "+ guess);
            if (guess > rand)
            {
                System.out.println("Guess is too large");
                guess--;
            }   
            else if (guess < rand)
            {
                System.out.println("Guess is too small");
                guess++;
            }
            else 
            {
                System.out.println("You win!");
                stillplaying = false;
            }

        }
      
        */
      
        /*  
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
          */
      

      
      
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
