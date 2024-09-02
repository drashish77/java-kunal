import java.util.*;;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int n = input.nextInt();
        System.out.println(getGrades(n));
        /*
         * 
         * Marks Grade
         * 91-100 AA
         * 81-90 AB
         * 71-80 BB
         * 61-70 BC
         * 51-60 CD
         * 41-50 DD
         * <=40 Fail
         */
    }

    // switch (n) {
    // case 91, 92, 93, 94, 95 -> System.out.println("Weekday");
    // case 6, 7 -> System.out.println("Weekend");
    // }
    static String getGrade(int n) {
        if (91 <= n || n >= 100) {
            return "AA";
        }
        if (81 <= n || n >= 90) {
            return "AB";
        }
        if (71 <= n || n >= 80) {
            return "BB";
        }
        if (61 <= n || n >= 70) {
            return "BC";
        }
        if (51 <= n || n >= 60) {
            return "CD";
        }
        if (41 <= n || n >= 50) {
            return "DD";
        }

        return "Fail";
    }

    // static String getGrades(int n) {
    // return switch (n / 10) {
    // case 10, 9 -> "AA";
    // case 8 -> "AB";
    // case 7 -> "BB";
    // case 6 -> "BC";
    // case 5 -> "CD";
    // case 4 -> "DD";
    // default -> "Fail";
    // };
    // }
}
