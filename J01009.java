import java.util.Scanner;

public class J01009 {

    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        long n = sc.nextLong();
        long tmp = 1, res = 0;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
            res += tmp;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int t = 1;
        while (t-- > 0) {
            testCase();
        }
    }
}
