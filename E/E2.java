import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int x = 1;
        

        if (number1 <= number2) {
            x = number1;
        } else {
            x = number2;
        }
        
        for(int i = x; i > 0; i--){
            if(number1 % i==0 && number2 % i==0){
                System.out.println(i);
                break;
            }
        }
        scanner.close();
    }
}
    

