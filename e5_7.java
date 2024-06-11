import java.util.Scanner;

public class e5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double sum = x + y + z;
        double avg = sum / 3;
        System.out.println(sum);
        System.out.println(avg);
        sc.close();
    }
    
}
