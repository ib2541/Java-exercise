import java.util.Scanner;

public class e5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        double sum, avg;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        sum = x + y + z;
        avg =(double) (x + y + z) / 3;

        System.out.println(sum);
        System.out.println(avg);

        sc.close();
    }
    
}
