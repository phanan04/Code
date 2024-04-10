import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

