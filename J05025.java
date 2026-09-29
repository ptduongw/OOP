import java.util.*;

class GiangVien implements Comparable<GiangVien> {
    public static int num = 1;
    public String id, hoTen, boMon, ten;

    public GiangVien(String hoTen, String boMon) {
        this.id = String.format("GV%02d", num++);
        this.hoTen = hoTen;
        this.boMon = boMon;

        String wordsHoTen[] = hoTen.trim().split("\\s+");
        this.ten = wordsHoTen[wordsHoTen.length - 1];

        String wordsBoMon[] = boMon.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : wordsBoMon) {
            sb.append(Character.toUpperCase(w.charAt(0)));
        }
        this.boMon = sb.toString();
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + boMon;
    }

    @Override
    public int compareTo(GiangVien o) {
        if (this.ten.compareTo(o.ten) == 0) {
            return this.id.compareTo(o.id);
        }
        return this.ten.compareTo(o.ten);
    }
}
public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            String hoTen = sc.nextLine().trim();
            String boMon = sc.nextLine().trim();

            list.add(new GiangVien(hoTen, boMon));
        }

        Collections.sort(list);
  
        for (GiangVien gv : list) {
            System.out.println(gv);
        }
    }
}
