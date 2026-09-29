import java.util.*;

public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String x = sc.next();
            String y = sc.next();
            String sum = "";

            while (x.length() < y.length()) x = "0" + x;
            while (y.length() < x.length()) y = '0' + y;

            int nho = 0;
            for (int i = x.length() - 1; i >= 0; i--) {
                int tmp = (x.charAt(i) - '0') + (y.charAt(i) - '0') + nho;
                sum = String.valueOf(tmp % 10) + sum;
                nho = tmp / 10;
            }
            if (nho != 0)
            sum = String.valueOf(nho) + sum;
            System.out.println(sum);
        }
    }
}
