import java.util.Scanner;;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        // System.out.println(oddEven(n));
        // System.out.println((n | 1) > n);
        System.out.println(bit(n));
    }

    static String oddEven(int n) {
        if (n % 2 == 0) {
            return "Even";
        }
        return "odd";
    }

    static boolean bit(int n) {
        return ((n | 1) > n);
    }
}
