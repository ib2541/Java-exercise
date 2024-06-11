import java.util.Scanner;

public class e5_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inches = sc.nextDouble();
        double feet, cm, yard;
        feet = inches / 12;
        cm = inches * 2.54;
        yard = inches / 36;
        
        System.out.println(feet);
        System.out.println(cm);
        System.out.println(yard);
        sc.close();
        
    }
    
}
