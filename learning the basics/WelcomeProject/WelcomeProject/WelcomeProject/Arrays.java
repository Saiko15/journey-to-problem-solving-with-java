package WelcomeProject;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int size;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter arrat size:");
        size= input.nextInt();
        
        double[] list = new double[size]; 
        char[] ch = new char[size];
        boolean[] bo = new boolean[size];


        System.out.println(list[5]); // 0.0
        System.out.println(ch[6]); // ''
        System.out.println(bo[7]); // false

    }
    
}
