import java.util.Scanner;;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println(isPalin(n));
    }

    static boolean isPalin(int n) {
        int original = n;
        int r = 0;
        while (n > 0) {
            int rem = n % 10;
            r = r * 10 + rem;
            n /= 10;
        }
        return original == r;
    }
}
