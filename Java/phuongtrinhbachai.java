import java.util.Scanner;

public class phuongtrinhbachai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = (float) -c / b;
        float delta = (float) Math.pow(b, 2) - (4 * a * c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("WOW");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.printf("%.2f", d);
            }
        } else {
            if (delta > 0) {
                float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("%.2f %.2f", Math.min(x1, x2), Math.max(x1, x2));
            } else if (delta == 0) {
                double xkep = -b / (2 * a);
                System.out.printf("%.2d", xkep);
            } else {
                System.out.println("NO");
            }
        }
    }
}
