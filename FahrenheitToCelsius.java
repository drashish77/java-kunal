import java.util.*;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a F value: ");
        int farenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        double celsius = (5.0 / 9) * (farenheit - 32);
        System.out.println(day + " fahrenheit: " + farenheit);
        System.out.println(day + " Celsius: " + celsius);

    }
}