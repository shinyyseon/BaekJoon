import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int count = 0;

        while(N >= 5) {
            count = count + N / 5;
            N /= 5;
        }

        System.out.print(count);
    }
}