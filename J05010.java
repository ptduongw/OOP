import java.util.*;

class MatHang implements Comparable<MatHang> {
    public static int num = 1;
    public int id;
    public String ten, nhomHang;
    public float giaMua, giaBan, loiNhuan;

    public MatHang(String ten, String nhomHang, float giaMua, float giaBan) {
        this.id = num++;
        this.ten = ten;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + nhomHang + " " + String.format("%.2f", loiNhuan);
    }

    @Override 
    public int compareTo(MatHang m) {
        return Float.compare(m.loiNhuan, this.loiNhuan);
    }
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] list = new MatHang[n];

        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine().trim();
            String nhomHang = sc.nextLine().trim();
            float giaMua = Float.parseFloat(sc.nextLine());
            float giaBan = Float.parseFloat(sc.nextLine());

            list[i] = new MatHang(ten, nhomHang, giaMua, giaBan);
        }

        Arrays.sort(list);

        for (MatHang m : list) {
            System.out.println(m);
        }
    }
}
