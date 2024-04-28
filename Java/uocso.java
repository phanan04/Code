import java.util.Scanner;           
public class uocso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("INF");    
        }
        else{
            if(n > 0){
                for(int i = n; i > 0; i--){
                    if(n % i == 0){
                        System.out.printf("%d ", i);
                    }
                }
            }
            else{
                n = -n;
                for(int i = n; i > 0; i--){
                    if(n % i == 0){
                        System.out.printf("%d ", i);
                    }
                }
            }
        }
    }
}
