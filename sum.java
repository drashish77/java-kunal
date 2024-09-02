import java.util.*;;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();

        System.out.println("The sum is: " + inte(n1, n2));
        System.out.println("The product is: " + product(n1, n2));

    }

    static String str() {
        return "This is new";
    }

    static int inte(int a, int b) {
        return a + b;
    }

    static int product(int a, int b) {
        return a * b;
    }
}
