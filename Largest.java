import java.util.*;;;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a = input.nextInt();
        System.out.print("Enter second no: ");
        int b = input.nextInt();
        System.out.print("Enter last no: ");
        int c = input.nextInt();

        /*
         * create a max and compare with it
         */
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("max is : " + max);
    }
}
