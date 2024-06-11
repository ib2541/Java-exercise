import java.util.Scanner;

public class ea427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("POSITIVE INTEGER");
        } else if (num < 0) {
            System.out.println("NOT POSITIVE INTEGER");
        }
        sc.close();
    }
    
}
