import java.util.*;

public class nsw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your employee id: ");
        int employeeId = input.nextInt();
        System.out.print("Enter your department name: ");
        String department = input.next();
        switch (employeeId) {
            case 1:
                System.out.println("Ashish Gupta");
                break;
            case 2:
                System.out.println("Rahul Goyal");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("I am from IT department");
                        break;
                    case "Management":
                        System.out.println("I am from Management department");
                        break;
                    default:
                        System.out.println("No department found");
                        break;
                }
                break;
        }
    }
}
