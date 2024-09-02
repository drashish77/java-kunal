import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Please enter a fruit name: ");
        // String fruit = input.next();
        System.out.print("Please enter a day number: ");
        int day = input.nextInt();

        // switch (fruit) {
        // case "mango":
        // System.out.println("I am the king");
        // break;
        // case "apple":
        // System.out.println("I am the sweet");
        // break;
        // default:
        // System.out.println("Please enter a valid fruit: ");
        // break;
        // }
        // switch (fruit) {
        // case "mango" -> System.out.println("I am the king");
        // case "banana" -> System.out.println("I am the strong");
        // case "apple" -> System.out.println("I am the docter");
        // case "gwawa" -> System.out.println("I am the taste");
        // default -> System.out.println("i am just a little fruit");
        // }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
