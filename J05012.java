import java.util.*;

class MatHang implements Comparable<MatHang> {
    public String id, ten;
    public long soLuong, donGia, chietKhau, total;

    public MatHang(String id, String ten, long soLuong, long donGia, long chietKhau) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.total = soLuong * donGia - chietKhau;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + soLuong + " " + donGia + " " + chietKhau + " " + total;
    }

    @Override 
    public int compareTo(MatHang m) {
        return Long.compare(m.total, this.total);
    }
}
public class J05012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] list = new MatHang[n];

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String ten = sc.nextLine();
            long soLuong = Long.parseLong(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            long chietKhau = Long.parseLong(sc.nextLine());

            list[i] = new MatHang(id, ten, soLuong, donGia, chietKhau);
        }

        Arrays.sort(list);

        for (MatHang m : list) {
            System.out.println(m);
        }
    }
}
