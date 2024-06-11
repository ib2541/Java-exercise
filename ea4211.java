import java.util.Scanner;

public class ea4211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        if (x > 100) {
            y = 20;
            System.out.println(y);
        } else if (x < 100) {
            y = 0;
            System.out.println(y);
        }
        sc.close();
    }
    
}
