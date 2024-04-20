import java.util.Scanner;

public class maytinhbotui {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        char c = inp.next().charAt(0);
        double b = inp.nextDouble();

        switch (c) {
            case '+':
                System.out.printf("%.2f", a + b);
                break;
            case '-':
                System.out.printf("%.2f", a - b);
                break;
            case '*':
                System.out.printf("%.2f", a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.printf("%.2f", a / b);
                } else
                    System.out.print("Math Error");
                break;
            default:
                System.out.print("Math Error");
        }
    }

}
