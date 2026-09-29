import java.util.*;

class ThiSinh {
    private String maTS, hoTen, trangThai;
    private double toan, ly, hoa, diemUT, tongDiem;

    public ThiSinh(String maTS, String hoTen, double toan, double ly, double hoa) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.toan= toan;
        this.ly = ly;
        this.hoa = hoa;

        this.tongDiem = toan * 2 + ly + hoa;

        char kv = maTS.charAt(2);
        switch (kv) {
            case '1':
                diemUT = 0.5;
                break;
            case '2':
                diemUT = 1;
                break;
            case '3':
                diemUT = 2.5;
                break;
            default:
                diemUT = 0;
                break;
        }

        if ((tongDiem + diemUT) >= 24) {
            trangThai = "TRUNG TUYEN";
        } else {
            trangThai = "TRUOT";
        }
    }

    private String formatDiem(double diem) {
        if (diem == (int) diem) {
            return String.format("%d", (int) diem);
        }
        return String.format("%.1f", diem);
    }

    @Override
    public String toString() {
        return maTS + " " + hoTen + " " + formatDiem(diemUT) + " " + formatDiem(tongDiem)+ " " + trangThai;
    }
}
public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maTS = sc.nextLine();
        String hoTen = sc.nextLine();
        double toan = Double.parseDouble(sc.nextLine());
        double ly = Double.parseDouble(sc.nextLine());
        double hoa = Double.parseDouble(sc.nextLine());

        ThiSinh ts = new ThiSinh(maTS, hoTen, toan, ly, hoa);
        System.out.print(ts);
    }
}
