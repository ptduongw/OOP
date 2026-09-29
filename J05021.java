import java.util.*;

class SinhVien implements Comparable<SinhVien> {
    public String id, hoTen, lop, email;

    public SinhVien(String id, String hoTen, String lop, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " + hoTen + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }
}
public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SinhVien> ds = new ArrayList<>();

        while (sc.hasNextLine()) {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            
            ds.add(new SinhVien(id, name, lop, email));
        }

        Collections.sort(ds);

        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
        
        sc.close();
    }
}
