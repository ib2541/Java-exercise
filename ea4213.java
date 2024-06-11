import java.util.Scanner;

public class ea4213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        

        if (x == 1) {
            double sum = y + z;
            System.out.println(sum);
        } else if (x == 2) {
            double mult = y * z;
            System.out.println(mult);
        } else if (x == 3) {
            double div = y / z;
            System.out.println(div);
        } else {
            System.out.println("please select only 1-3");
        }
        sc.close();
    }
    
}
