import java.util.Scanner;

public class phansotoigian {
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return Math.abs(gcd(b,a%b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tu = a/gcd(a,b);
        int mau = b/gcd(a,b);
        if (b == 0){
            System.out.println("INVALID");
        }
        else if(a == 0){
            System.out.println("0");
        }
        else{
            if(tu % mau == 0){
                System.out.println(tu/mau);
            }
            else{
                if(a<0 && b<0){
                    System.out.printf(Math.abs(tu)+" "+Math.abs(mau));
                }
                else{
                    System.out.printf(tu+" "+mau);
                }
            }
        }
        
    }
}
