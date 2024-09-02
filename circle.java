import java.util.*;;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println(getPeri(radius));
        System.out.println(getArea(radius));

    }

    static double getPeri(double r) {
        double p = 2 * Math.PI * r;
        return p;
    }

    static double getArea(double r) {

        double a = Math.PI * r * r;
        return a;
    }
}
