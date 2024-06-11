import java.util.Scanner;

public class ea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double T = sc.nextDouble();
        double l = sc.nextDouble();
        double pi = Math.PI;
        double x = Math.pow(T / (2 * pi), 2);
        System.out.println(l / x);
        
        sc.close();
    }
}
