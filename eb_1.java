import java.util.Scanner;

public class eb_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        
        int min = n[0];
        int max = n[0];
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
            if (n[i] > max) {
                max = n[i];
            }
            sum += n[i];
        }
        System.out.println((double) sum / n.length);
        System.out.println(min);
        System.out.println(max);

        sc.close();

    }

}
