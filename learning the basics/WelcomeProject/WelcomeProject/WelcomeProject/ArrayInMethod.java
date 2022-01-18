package WelcomeProject;

import java.util.Scanner;

public class ArrayInMethod {
    public static void main(String[] args) {
        int[] arr = new int[10]; // you can put variable instead of 10 and make it dynamic
        System.out.println(fillArray(arr));        
    }
    public static int fillArray(int[] list){
        Scanner input = new Scanner(System.in); // or use it above but put static before it
        int sum=0;
        for (int i=1;i<list.length;i++)
        {
            System.out.println("enter next element");
            list[i]= input.nextInt();
            sum += list[i];
        }
        return sum;
    }
    
}
