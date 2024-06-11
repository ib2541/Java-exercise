import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int count = 0;
        int k = 1;
        while (k <= a) {
            if (a % k == 0) {
                count++;
            }
            k++;
            System.out.println(count);
        }
        sc.close();
    }
    
}
