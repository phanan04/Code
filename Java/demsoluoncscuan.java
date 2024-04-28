import java.util.Scanner;

public class demsoluoncscuan {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String n = inp.nextLine();
    
        System.out.printf("%d", ( n.charAt(0)=='-') ? n.length()-1 : n.length());
    }
    
}
