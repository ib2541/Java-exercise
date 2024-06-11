import java.util.Scanner;

public class diamonds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                if (i + j == lines / 2 || i - j == lines / 2 || j - i == lines /2 || i + j == lines + lines / 2 -1) {
                    System.out.print("x");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
