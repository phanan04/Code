import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum  = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        String result  = (sum == n) ? "YES" : "NO";
        System.out.println(result);
    }
}
