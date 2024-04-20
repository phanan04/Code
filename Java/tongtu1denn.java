import java.util.Scanner;

public class tongtu1denn {
    private static long factorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += Math.pow(x,i)/factorial(i);

        }
        System.out.printf("%.2f",sum);
    }
}
