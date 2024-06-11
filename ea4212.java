import java.util.Scanner;

public class ea4212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        if (weight < 1 && weight > 0) {
            System.out.println("50");
        } else if (weight < 2 && weight > 1) {
            System.out.println("60");
        } else if (weight < 3 && weight > 2) {
            System.out.println("70");
        } else if (weight > 3) {
            System.out.println("100");
        }
        sc.close();
    }
    
}
