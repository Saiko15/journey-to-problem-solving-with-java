package OOP;

public class OurFirstClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 20.6; // because width is public
        // r1.length = 10.3; // cannot accessed because it's private
        r1.setlength(3);
        r1.setwidth(6);
        System.out.println(r1.width); //  6.0

        Rectangle r2 = new Rectangle();
        r2.setlength(30);
        r2.setwidth(20); // Tab to get out paranthasses
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle(69, 58);
        r3.modifyingobject(r4); // passing object to a method
        System.out.println(r3.getlength());
        Rectangle r5 = new Rectangle(20, 30);
        Rectangle r6 = new Rectangle(50, 60); 
        r6.add(r5);
        System.out.println(r6.getlength()); // 50
        System.out.println(r6.add(r5).getlength());  // 70
    }
}
