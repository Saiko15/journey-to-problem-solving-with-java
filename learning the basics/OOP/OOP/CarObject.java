package OOP;

public class CarObject {
    public static void main(String[] args) {
        Car bmw;
        // Rectangle r3; // also can be applies here because it's the same package
        String maker;
        int year;
        
        bmw = new Car();
        bmw.setmaker("joe");
        bmw.setmodel(1998); // invalid model
        maker = bmw.getmaker();
        year = bmw.getmodel();

        // System.out.println(maker);
        // System.out.println(year);
    }
}
