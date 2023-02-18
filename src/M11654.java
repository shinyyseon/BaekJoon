import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char n = bf.readLine().charAt(0);

        System.out.print((int) n);
    }
}