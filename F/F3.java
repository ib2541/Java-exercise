import java.util.Scanner;

public class F3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 0;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                y++;
            }
        }
        if (x == 1) {
            System.out.println("is not a prime number");
        }
        else if (y == 0) {
            System.out.println("is a prime number");

        } else {
            System.out.println("is not a prime number");
        }
        scanner.close(); 
    }
}
