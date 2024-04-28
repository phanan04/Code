import java.util.Scanner;
public class LCM {
    public static int GCD(int a,int b){
        if(b == 0) return a;
        return Math.abs(GCD(b,a%b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.abs(a*b) / GCD(a,b));
    }
}
