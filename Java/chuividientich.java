import java.util.Scanner;

public class chuividientich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = (float) 6.28 * a;
        float c = (float) 3.14 * a * a;
        System.out.printf("%.3f ", b);
        System.out.printf("%.3f", c);
    }
}
