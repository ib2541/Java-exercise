import java.util.Scanner;

public class ea1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double g = 9.8;
        double R = 6371e3;
        double m2 = 5.974e24;
        double x = Math.pow(R, 2) * g;
        System.out.println(x / m2);
        sc.close();
    }
}