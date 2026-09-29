import java.util.*;

class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        width = 1;
        height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public double findArea() {
        return this.height * this.width;
    }

    public double findPerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return (int)findPerimeter() + " " + (int)findArea() + " " + getColor();
    }
}
public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String c = sc.next();

        if (w > 0 && h > 0) {
            Rectange hcn = new Rectange(w, h, c);
            System.out.print(hcn);
        } else {
            System.out.print("INVALID");
        }
    }
}
