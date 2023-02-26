import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] alpha = bf.readLine().split("");
        long result = 0;
        long pow = 1;

        for(int i = 0;i < n;i++) {
            result += ((int) alpha[i].charAt(0) - 96) * pow;
            pow = pow * 31 % 1234567891;
        }
        System.out.print(result % 1234567891);
    }
}