import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int number1 = scanner.nextInt();
        
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.print(number1);
        } else {
            System.out.print(number2);
        }
        scanner.close();
    }
}
