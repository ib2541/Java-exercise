import java.util.Scanner;

public class e5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f0 = 2e10;
        double f1 = scanner.nextDouble();
        double v = (10.7585e8);
        double x = (f1 - f0)/(f1 + f0);
        System.out.println(v * x);
        scanner.close();
    }
    
}
