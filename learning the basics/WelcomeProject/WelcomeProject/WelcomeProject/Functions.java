package WelcomeProject;

public class Functions {
    public static void main(String[] args) {
        drawline('*',10); // char should be '' not "" because "" is string
        drawline('#',20);
        drawline('~',50);
    }
    public static void drawline(char ch, int length){
        for(int i=1;i<=length;i++)
        {
            System.out.print(ch);
            // System.out.println();
        }
        System.out.println();
    }
    
}
