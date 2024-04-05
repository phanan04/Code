
import java.util.Scanner;

class tong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        float f = (float) a/b;
        if (a == 0 && b == 0){
            System.out.println("ERROR");
        }
        else{
            System.out.printf("%.2f", (float) f);
        }
        
    }
}
