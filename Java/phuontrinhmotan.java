import java.util.Scanner;

public class phuontrinhmotan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float) -b / a;
        if (a == 0) {
            if (b != 0) {
                System.out.println("NO");
            } else {
                System.out.println("WOW");
            }
        } else {
            System.out.printf("%.2f", c);
        }
    }
}
