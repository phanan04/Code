import java.util.Scanner;

public class inrachucai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char a = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        for(int i = a; i <= c; i++){
            System.out.print((char)(i-32)+" ");
        }
    }
}
