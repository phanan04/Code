import java.util.*;

public class max2mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        Arrays.sort(array);
        if (array[0] != array[n - 1]) {
            System.out.println(array[n - 2]);
        } else {
            System.out.println("NOT FOUND");
        }

    }
}
