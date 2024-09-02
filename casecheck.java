import java.util.*;;

public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a character: ");
        char ch = input.next().trim().charAt(0);
        // int n = ch;
        if (ch >= 'a' && ch <= 'z') {

            System.out.println(ch + " is a lowercase");
        } else {

            System.out.println(ch + " is a uppercase");
        }
    }
}
