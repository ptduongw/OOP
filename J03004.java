import java.util.Scanner;

public class J03004 {
    public static Scanner sc = new Scanner(System.in);

    public static String chuanHoa(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void testCase() {
        String line = sc.nextLine().trim();
        String[] words = line.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = chuanHoa(words[i]);
        }

        System.out.println(String.join(" " , words));
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            testCase();
        }
    }
}
