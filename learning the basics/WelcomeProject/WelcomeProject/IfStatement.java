package WelcomeProject;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int a;
        System.out.println("type a number");
        a = number.nextInt();

        if (a % 2 ==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
    
}