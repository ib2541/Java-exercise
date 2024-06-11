import java.util.Scanner;

public class ea1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double R = sc.nextDouble();
        double f = sc.nextDouble(); 
        double x = Math.pow(R, 2) * f;
        double y = m1 * m2;

        System.out.println(x / y);
        sc.close();
    }
   

}