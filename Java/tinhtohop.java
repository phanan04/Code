import java.util.Scanner;
public class tinhtohop {
    public static int tohop(int n){
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int result = tohop(n)/(tohop(k) * tohop(n-k));
        System.out.println(result);
    }
}
