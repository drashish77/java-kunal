import java.util.*;;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n) {
        // remove 1 as it is not a prime number
        if (n <= 1) {
            return false;
        }

        int c = 2;
        // check all the number more than 3
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        // check for 2 and 3
        return c * c > n;
    }
}
