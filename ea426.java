import java.util.Scanner;

public class ea426 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hrs = sc.nextInt();
        int mins = sc.nextInt();
        int fee = calculate(hrs, mins);

        System.out.println(fee);
        sc.close();
    }

    public static int calculate(int hrs, int mins) {
        //int rate = 30;
        int fee = 0;

        if (hrs > 0 ) {
            fee = (hrs - 1)* 30;
            if (mins > 0) {
                fee = fee + 30;
            }
            //double remain = Math.ceil((mins + 60 * hrs) / 60);
            //fee += (remain - 1) * rate;
        }
        return fee;
    }

}
