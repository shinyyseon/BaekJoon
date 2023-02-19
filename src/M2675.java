import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        String[] arp = new String[n];
        Arrays.fill(arp,"");

        for(int i = 0;i < n;i++) {
            st = new StringTokenizer(bf.readLine());
            int r = Integer.parseInt(st.nextToken());
            String[] p = st.nextToken().split("");
            for(int j = 0;j < p.length;j++)
                for(int k = 0;k < r;k++)
                    arp[i] += p[j];
        }
        for(int i = 0;i < n;i++) {
            System.out.println(arp[i]);
        }
    }
}