import java.util.Scanner;

public class J03005 {
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

        for (int i = 1; i < words.length; i++) {
            if (i != 1) System.out.print(" ");
            System.out.print(words[i]);
        }
        System.out.println(", " + words[0].toUpperCase());
    }

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            testCase();
        }
    }
}
