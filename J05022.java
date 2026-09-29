import java.util.*;

class SinhVien {
    public String id, hoTen, lop, email;

    public SinhVien(String id, String hoTen, String lop, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getClassName() {
        return lop;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + lop + " " + email;
    }
}
public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            
            ds.add(new SinhVien(id, name, lop, email));
        }

        int q = Integer.parseInt(sc.nextLine());

        while (q-- > 0) {
            String className = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + className + ":");
            for (SinhVien sv : ds) {
                if (sv.getClassName().equals(className)) {
                    System.out.println(sv);
                }
            }
        }
        
        sc.close();
    }
}
