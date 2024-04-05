
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("NO");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
            System.out.println("YES");
        }
    }
}
