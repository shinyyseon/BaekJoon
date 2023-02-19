import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] num = bf.readLine().split("");
        int sum = 0;

        for(int i = 0;i < n;i++) {
            sum += Integer.parseInt(num[i]);
        }
        System.out.print(sum);
    }
}