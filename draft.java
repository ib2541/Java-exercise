import java.util.Scanner;

public class draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        int z;
        z = max(x, y);
        System.out.println(z);
        sc.close();
    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
