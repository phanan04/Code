import java.util.Scanner;

public class chiahetcho3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ok = 0;
        for (int i = b - 1; i > a; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                ok = 1;
            }
        }
        if (ok != 1) {
            System.out.println("NOT FOUND");
        }

    }
}
