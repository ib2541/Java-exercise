import java.util.Scanner;

public class ea5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;

        if (n1 >= n2 && n1 >= n3) {
            x = n1;
            y = n2;
            z = n3;
        } else if (n2 >= n3 && n2 >= n1) {
            x = n2;
            y = n3;
            z = n1;
        } else if (n3 >= n1 && n3 >= n2) {
            x = n3;
            y = n1;
            z = n2;
        }

        if (n1 + n2 <= n3) {
            System.out.println("is not triangle");
        } else if (n1 + n3 <= n2) {
            System.out.println("is not triangle");
        } else if (n2 + n3 <= n1) {
            System.out.println("is not triangle");
        } else {
            if ((x * x) == (y * y) + (z * z)) {
                System.out.println("right triangle");
            } else if ((x * x) > (y * y) + (z * z)) {
                System.out.println("obtuse triangle");
            } else if ((x * x) < (y * y) + (z * z)) {
                System.out.println("acute-angled triangle");
                sc.close();
            }
            if (n1 == n2 && n2 == n3) {
                System.out.println("equilateral triangle");
            } else if ((n1 == n2 && n2 != n3) || (n1 == n3 && n1 != n2)) {
                System.out.println("isosceles triangle");
            } else if (n1 != n2 && n2 != n3) {
                System.out.println("scalene triangle");
            }

        }

    }
}