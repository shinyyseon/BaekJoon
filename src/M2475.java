import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] num = new int[5];
        int result = 0;

        for(int i = 0;i < 5;i++) {
            num[i] = Integer.parseInt(st.nextToken());
            num[i] *= num[i];
        }

        for(int i = 0;i < 5;i++) {
            result += num[i];
        }
        System.out.print(result % 10);
    }
}