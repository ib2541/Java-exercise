import java.util.Scanner;

public class day4_2 {
    public static void main(String[] args) {
        int sum = 0, n = 0, count = 0;
        try (Scanner sc = new Scanner(System.in)) {
            double avg;
            for(;;) {
                n = sc.nextInt();
                if (n == 0) {
                    break;
                } else {
                    sum += n;
                    count++;
                }
            }
            avg = (double) sum / count;
            System.out.println(avg);
            sc.close();
        }
    }
}
