import java.util.Scanner;

public class ea1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double g = 6.67e-11;
        double r = sc.nextDouble();
        double x = (m1 * m2) / (r * r);
        
        
        System.out.println(x * g);
        sc.close();
    } 

    
}
