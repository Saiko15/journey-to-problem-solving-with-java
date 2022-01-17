package WelcomeProject;

public class Functions {
    public static void main(String[] args) {
        drawline('*',10); // char should be '' not "" because "" is string
        drawline('#',20);
        drawline('~',50);

        int total = sum(50, 100);
        System.out.println(total);     
        System.out.println(sum(60, 20));
        System.out.println(sum(10, 20)*5/3); // press tab to jump to next parameter



    }
    public static void drawline(char ch, int length){
        for(int i=1;i<=length;i++)
        {
            System.out.print(ch);
            // System.out.println();
        }
        System.out.println();
    }
    public static int sum(int i ,int j)
    {
        int result = 0;
        result = i + j;
        return result; // int function must have return keyword
    }
    
}
