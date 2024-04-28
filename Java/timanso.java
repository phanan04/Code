import java.util.Scanner;

public class timanso {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long n,x,s;
        n = sc.nextLong();
        s = 0;x = 0;
        while(s<=n){
            x++;
            s += x;
        } 
        System.out.println(x-1);
    }
}
