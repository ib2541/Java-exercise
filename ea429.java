import java.util.Scanner;

public class ea429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score > 80) {
            System.out.println("A");
        } else if (score < 80 && score >= 70) {
            System.out.println("B");
        } else if (score < 70 && score >= 60) {
            System.out.println("C");
        } else if (score < 60 && score >= 50) {
            System.out.println("D");
        } else if (score < 50) {
            System.out.println("F");
        }
        sc.close();
    }
    
}
