package WelcomeProject;

public class Functions {
    public static void main(String[] args) {
        drawline('*'); // char should be '' not "" because "" is string
        drawline('#');
        drawline('~');
    }
    public static void drawline(char ch){
        for(int i=1;i<=10;i++)
        {
            System.out.print(ch);
            // System.out.println();
        }
        System.out.println();
    }
    
}
