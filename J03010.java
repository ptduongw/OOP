import java.util.*;

public class J03010 {
    public static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> dd = new ArrayList<>();

        while(t-- > 0) {
            String line = sc.nextLine().trim().toLowerCase();

            if (line.isEmpty()) {
                continue;
            }

            String[] words = line.split("\\s+");

            String s = words[words.length - 1];
            for (int i = 0; i < words.length - 1; i++){
                s += words[i].charAt(0);
            }
            dd.add(s);
            int count = Collections.frequency(dd, s);
            s += (count == 1 ? "" : count) + "@ptit.edu.vn";

            System.out.println(s);
        }
    }
}
