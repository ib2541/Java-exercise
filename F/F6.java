public class F6 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        int number = 0;
        int i = 0;

        while (number < 100) {
            if (isPrime(i)) {
                System.out.println(i);
                number++;
            }
            i++;
        }
    }
}
