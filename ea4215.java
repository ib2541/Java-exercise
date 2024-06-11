import java.util.Scanner;

public class ea4215 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x + y == z) {
            System.out.println("+");
        } else if (x - y == z) {
            System.out.println("-");
        } else if (x * y == z) {
            System.out.println("*");
        } else if (x / y == z) {
            System.out.println("/");
        }
        sc.close();
    }
    
}
