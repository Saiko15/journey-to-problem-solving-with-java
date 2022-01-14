package WelcomeProject;

public class Arithmic {
    public static void main(String[] args) {
        System.out.println(5 / 2); // 2
        System.out.println(5.0 / 2); // 2.5
        System.out.println( (float) 5 / 2); // 2.5 
        System.out.println(5 / (float) 2); // 2.5

        // ++i = pre-increment
        // i++ = post-increment

        // --i = pre-decrement
        // i-- = post-decrement
        int i = 9;
        System.out.println(i++); // 9
        System.out.println(i); // 10 
        System.out.println(++i); // 11

        // =	a = b;	a = b;
        // +=	a += b;	a = a + b;
        // -=	a -= b;	a = a - b;
        // *=	a *= b;	a = a * b;
        // /=	a /= b;	a = a / b;
        // %=	a %= b;	a = a % b;
        int j = 4;
        System.out.println(j += 6); // j + 6 = 10
        System.out.println(j *= 4); // j * 4 = 40

    }
}
