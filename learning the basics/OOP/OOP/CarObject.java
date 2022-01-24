package OOP;

public class CarObject {
    public static void main(String[] args) {
        Car c1;
        // Rectangle r3; // also can be applies here because it's the same package
        String maker;
        int year;
        
        c1 = new Car();
        c1.setmaker("Honda"); // Must be bmw or mercedes or audi 
        c1.setmodel(1998); // invalid model
        maker = c1.getmaker();
        year = c1.getmodel();

        System.out.println(maker); // null is ""
        System.out.println(year);
    }
}
