import java.util.Scanner;
import java.util.Arrays;

public class variableLengthArgs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = input.nextInt();
        // vla(1, 2, 3, 3, 4, 5);
        // boolean ans = isPrime(n);
        // System.out.println(ans);
        // boolean isarm = isArmstrong(n);
        // System.out.println(isarm);

        // print all the 3 digit armstrong number
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static void vla(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return c * c > n;
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {

            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }
}
