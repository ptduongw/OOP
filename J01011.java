import java.util.Scanner;

public class J01011 {

    public static Scanner sc = new Scanner(System.in);

    public static long gcd(long a, long b) {
        while (b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void testCase() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b) + " " + gcd(a, b));
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            testCase();
        }
    }
}
