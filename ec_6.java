import java.util.Scanner;
import java.util.Arrays;

public class ec_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}