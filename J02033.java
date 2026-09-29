import java.util.*;

public class J02033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            if (a[i] < 0 && k > 0) {
                a[i] = - a[i];
                k--;
            } else if (a[i] >= 0) break;
        }

        long sum = 0;
        long mina = Long.MAX_VALUE;
        for (long i : a) {
            sum += i;
            if (i < mina) mina = i;
        }

        if (k > 0 && k % 2 == 1) 
            sum -= 2 * mina;

        System.out.print(sum);
    }
}
