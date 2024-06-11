import java.util.Scanner;

public class ea4214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x + y > z && y + z > x && z + x > y) {
            System.out.println("triangle");
        } else  {
            System.out.println("not triangle");
        }
        sc.close();
    }
}