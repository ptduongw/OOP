import java.util.*;

class ThiSinh implements Comparable<ThiSinh>{
    public static int num = 0;
    public String hoTen, ngaySinh;
    public int id;
    public float m1, m2, m3, total;

    public ThiSinh(String hoTen, String ngaysinh, float m1, float m2, float m3) {
        this.id = num++;
        this.hoTen = hoTen;
        this.ngaySinh = ngaysinh;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

        this.total = m1 + m2 + m3;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + ngaySinh + " " + String.format("%.1f", total);
    }

    @Override
    public int compareTo(ThiSinh ts) {
        if (Float.compare(this.total, ts.total) == 0) {
            return (this.id - ts.id);
        }
        return Float.compare(ts.total, this.total);
    }
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();

        while(t-- > 0) {
            String hoTen = sc.nextLine().trim();
            String ngaySinh = sc.nextLine().trim();
            float m1 = Float.parseFloat(sc.nextLine());
            float m2 = Float.parseFloat(sc.nextLine());
            float m3 = Float.parseFloat(sc.nextLine());

            list.add(new ThiSinh(hoTen, ngaySinh, m1, m2, m3));
        }

        Collections.sort(list);

        float highest = list.get(0).total;
        for (ThiSinh ts : list) {
            if (ts.total == highest) {
                System.out.println(ts);
            } else {
                break;
            }
        }
    }
}
