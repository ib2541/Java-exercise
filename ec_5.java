import java.util.Scanner;
import java.util.Arrays;

public class ec_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();
        int l = scanner.nextInt();

        
        for (int j = 9; j > l; j--) {
            int x;
            x = numbers[j];
            numbers[j] = numbers[j - 1];
            numbers[j - 1] = x;
        } 
        numbers[l] = v;

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}