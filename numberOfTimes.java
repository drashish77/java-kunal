import java.util.Scanner;

public class numberOfTimes {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Number to be counted: ");
        int findNumber = input.nextInt();

        int count = 0;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder == findNumber) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(findNumber + " counts: " + count);
    }
}
