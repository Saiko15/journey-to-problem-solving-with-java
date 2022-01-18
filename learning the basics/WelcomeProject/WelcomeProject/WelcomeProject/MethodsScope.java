package WelcomeProject;

import java.util.Scanner;

public class MethodsScope {
    public static void main(String[] args) {
        int num1, num2, num3, total;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        total = sum(num1, num2, num3);
        avg = average(num1, num2, num3);
        display(total, avg);

        larger(1  , 2); // larger int
        larger('A', 'B'); // larger char
        larger(1, 2 , 3); // larger with three int
        
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static double average(int a, int b, int c){
        return sum(a, b, c)/3;
    }
    public static void display(int t, double a){
        System.out.println("the sum is "+ t);
        System.out.println("the average is "+ a);
    }
    public static int larger(int a, int b){
        if (a>b) return a;
        else return b;
    }
    public static char larger(char a, char b){
        if (a>b) return a;
        else return b;
    }
    public static int larger(int a, int b, int c){
        if (a>b&&a>c) return a;
        else if (b>a&&b>c) return b;
        else return c;
    }
}
