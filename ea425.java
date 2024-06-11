import java.util.Scanner;

public class ea425 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        int B = scanner.nextInt();

        int C = scanner.nextInt();

        int m = scanner.nextInt();

        int Y;

        if (m > 5) {
            Y = A * m * 2 + B * m + C;
        } else if (m == 5) {
            Y = A * m * 2 + B * m - C;
        } else {
            Y = A * m * 2 + B * m;
        }

        System.out.println(Y);

        scanner.close();
    }
}
