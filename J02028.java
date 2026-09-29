import java.util.*;

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            boolean found = false;
            long sum = 0;
            int l = 0, r = 0;
            
            while(l<n){
                if(sum == k){
                    found = true;
                    break;
                }
                if(l==r || sum < k){
                    r++;
                    if(r==n) break;
                    sum+=a[r];
                }else if(sum > k){
                    sum-=a[l];
                    l++;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
