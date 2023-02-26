import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] num = bf.readLine().split(" ");
        int result = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n; k++) {
                    int temp = Integer.parseInt(num[i]) + Integer.parseInt(num[j]) + Integer.parseInt(num[k]);

                    if (temp == m) {
                        result = temp;
                        break;
                    }
                    if (temp < m && result < temp) result = temp;
                }
            }
        }
        System.out.println(result);
    }
}