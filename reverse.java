import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = input.nextInt();
        int r = 0;

        while (n > 0) {
            int remainder = n % 10;
            r = r * 10 + remainder;
            n /= 10;

        }
        System.out.println(r);
    }
}
