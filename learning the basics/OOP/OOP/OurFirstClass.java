package OOP;

public class OurFirstClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 20.6; // because width is public
        // r1.length = 10.3; // cannot accessed because it's private
        r1.setlength(3);
        r1.setwidth(6);
        System.out.println(r1.width); //  6.0
    }
}
