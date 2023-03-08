import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 1;

        for(int i = 2;i <= n || i <= m;i++) {
            if(n % i == 0 && m % i == 0)     result = i;
        }

        System.out.println(result);
        System.out.println(n * m / result);
    }
}