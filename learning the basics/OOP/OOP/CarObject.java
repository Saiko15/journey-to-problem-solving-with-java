package OOP;

public class CarObject {
    public static void main(String[] args) {
        Car bmw;
        String maker;
        int year;
        
        bmw = new Car();
        bmw.setmaker("joe");
        bmw.setmodel(1998);
        maker = bmw.getmaker();
        year = bmw.getmodel();

        System.out.println(maker);
        System.out.println(year);
    }
}
