package Lab.exp3;

public class DynamicInitialization {

    public static void main(String args[]) {
        double a = 3.0, b = 4.0f;

        // c is dynamically initialized
        double c = Math.sqrt(a*a + b*b);
        double d = c * a;
        System.out.println("\n");
        System.out.println("Hypotenuse is " + c);
        System.out.println("value of d " + d);
        System.out.println("\n");
    }
}