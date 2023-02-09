import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int n1 = 0, n2 = 1, sum;

        for(int i = 0;i < n;i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println(n1);
    }
}