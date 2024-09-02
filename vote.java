import java.util.*;;

public class vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println(canVote(age));
    }

    static String canVote(int age) {
        if (age >= 18) {
            return "Yes, you can vote";
        } else {
            return "No, You can't vote";
        }
    }
}
