import java.util.Scanner;

public class ea4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double l = sc.nextDouble();
        double x = l / A;
        double p = 1.59e-8;
        System.out.println(p * x);

        sc.close();
    }
    
}
