import java.util.*;

public class J03009 {
    public static Scanner sc = new Scanner(System.in);

    public static void testCase() {
        String line1 = sc.nextLine().trim();
        String line2 = sc.nextLine().trim();

        String[] words = line1.split("\\s+");
        HashSet<String> set = new HashSet<>();

        for (String w : words) {
            if (!line2.contains(w)) {
                set.add(w);
            }
        }
        
        for (String w : set) {
            System.out.print(w + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            testCase();
        }
    }
}
