import java.math.BigInteger;
import java.util.*;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            BigInteger x = new BigInteger(s1);
            BigInteger y = new BigInteger(s2);
            BigInteger d = x.subtract(y).abs();
            String res = d.toString();

            int maxlength = Math.max(s1.length(), s2.length());

            int z = maxlength - res.length();
            for (int i = 0; i < z; i++) 
                res = "0" + res;
            System.out.println(res);
        }
    }
}
