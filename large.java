import java.util.Scanner;

public record large() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get 3 input
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        System.out.print("Enter third number: ");
        int n3 = input.nextInt();
        // System.out.println(findLargest(n1, n2, n3));
        System.out.println(findSmallest(n1, n2, n3));
    }

    static int findLargest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int findSmallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
