import java.util.Scanner;

public class ea4210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c == 1) {
            int sum = a + b;
            System.out.println(sum);
        } else if (c == 2) {
            int minus = a - b;
            System.out.println(minus);
        } else if (c == 3) {
            int mult = a * b;
            System.out.println(mult);
        } else if (c == 4) {
            int div = a / b;
            System.out.println(div);
        }
        sc.close();
    }
    
}
