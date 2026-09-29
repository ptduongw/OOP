import java.util.*;

class NhanVien {
    private String maNV;
    private String hoTen;
    private long luongCB, luong, thuong, phuCap, thuNhap;
    private int ngayCong;
    private String chucVu;

    public NhanVien(String hoTen, long luongCB, int ngayCong, String chucVu) {
        this.maNV = "NV01";
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    

        this.luong = (long)luongCB * ngayCong;
    
        if (ngayCong >= 25) {
            this.thuong = (long)luong * 2 / 10;
        } else if (ngayCong >= 22) {
            this.thuong = (long)luong / 10;
        } else this.thuong = 0;

        switch (chucVu) {
            case "GD":
                this.phuCap = 250000;
                break;
            case "PGD":
                this.phuCap = 200000;
                break;
            case "TP":
                this.phuCap = 180000;
                break;
            case "NV":
                this.phuCap = 150000;
                break;
        }

        this.thuNhap = luong + thuong + phuCap;
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + luong + " " + thuong + " " + phuCap + " " + thuNhap;
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hoTen = sc.nextLine().trim();
        long luongCB = Long.parseLong(sc.nextLine());
        int ngayCong = Integer.parseInt(sc.nextLine());
        String chucVu = sc.nextLine().trim();

        NhanVien nv = new NhanVien(hoTen, luongCB, ngayCong, chucVu);
        System.out.print(nv);

        sc.close();
    }
}
