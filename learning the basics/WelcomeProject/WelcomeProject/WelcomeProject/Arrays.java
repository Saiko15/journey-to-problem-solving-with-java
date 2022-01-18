package WelcomeProject;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int size;
        double sum=0;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter arrat size:");
        size= input.nextInt();
        
        double[] list = new double[size];

        for(int i=0;i<list.length;i++)
        {
            System.out.println("Enter the salary of employee no "+ (i+1));
            list[i]= input.nextDouble();
            sum += list[i];

        }
        System.out.println("The sum is: "+ sum);
        System.out.println("The average is: "+ sum/list.length);
        




        // double[] list = new double[size]; 
        // char[] ch = new char[size];
        // boolean[] bo = new boolean[size];


        // System.out.println(list[5]); // 0.0
        // System.out.println(ch[6]); // ''
        // System.out.println(bo[7]); // false

    }
    
}
