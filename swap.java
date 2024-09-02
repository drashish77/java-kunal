public class swap {

    int[] love = { 1, 2, 3, 4, 5, 6 };

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(swap(a, b));

    }

    static int swap(int a, int b) {
        int tempA = a;
        a = b;
        b = tempA;
        return a;
    }
}
