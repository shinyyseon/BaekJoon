import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = 0, b = 0;
        int n = Integer.parseInt(bf.readLine());

        for(int i = 0;i < n;i++) {
            st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            int result = 1;

            for(int j = 0; j < b; j++)  result = (result * a) % 10;

            if(result == 0)             System.out.println(10);
            else                        System.out.println(result);
        }
    }
}