import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        resverseString = "";
        char ch;
        for(int i = n.length()-1; i >= 0; i--){
            ch = n.charAt(i);
            resverseString = n.charAt(i) + resverseString;
        }
        System.out.println(resverseString);
    }
}
