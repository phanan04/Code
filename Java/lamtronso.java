import java.util.Scanner;

public class lamtronso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        // Lay so nguyen la phan nguyen cua n
        int x = (int) n;
    
        double sub = Math.abs(n-x);
    
        if(n > 0){
            if(sub < 0.5){
                System.out.print(x);
            }else{
                System.out.print(x+1);
            }
        }else{
            if(sub <= 0.5){
                System.out.print(x);
            }else{
                System.out.print(x-1);
            }
        }
    }

    }
}
