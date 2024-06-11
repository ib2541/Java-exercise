import java.util.Scanner;

public class e5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int lenght = (x * 2) + (y * 2);
        int area = x * y;
        System.out.println(area);
        System.out.println(lenght);
        sc.close();
    }
    
}
