import java.util.*;

class Player implements Comparable<Player>{
    public String id, ten, gioVao, gioRa;
    public int time;

    public Player(String id, String ten, String gioVao, String gioRa) {
        this.id = id;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.time = 60 * (Integer.parseInt(gioRa.substring(0, 2)) - Integer.parseInt(gioVao.substring(0, 2))) 
                   + (Integer.parseInt(gioRa.substring(3)) - Integer.parseInt(gioVao.substring(3)));
    }

    public String getTime() {
        int h = time / 60;
        int m = time % 60;
        return String.format("%d gio %d phut", h, m);
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + getTime();
    }

    @Override
    public int compareTo(Player p) {
        return Integer.compare(p.time, this.time);
    }
}
public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Player[] list = new Player[n];

        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            list[i] = new Player(id, name, gioVao, gioRa);
        }

        Arrays.sort(list);

        for (Player p : list) {
            System.out.println(p);
        }
    }
}
