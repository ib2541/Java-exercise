import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Array {
    public static void main(String[] args) throws IOException {
        char ch = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write characters and exit by e");
        while(ch != 'e') {
            ch = (char)br.read();
            System.out.println("you type : " + ch);
        }
    }
}