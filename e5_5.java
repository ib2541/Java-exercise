import java.util.Scanner;

public class e5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f =  (c * 1.8) + 32;
        System.out.println(f);
        sc.close();
    }
    
}
