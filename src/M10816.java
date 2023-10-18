import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        int[] s1 = new int[N + 1];
        int[][] count = new int[2][10000001];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0;i < N;i++) {
            s1[i] = Integer.parseInt(st.nextToken());
            if(s1[i] < 0)  count[0][-s1[i]]++; // -
            else           count[1][s1[i]]++; // +

        }

        int M = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i = 0;i < M;i++) {
            int s = Integer.parseInt(st.nextToken());

            if(s < 0)  sb.append(count[0][-s]).append(" ");
            else       sb.append(count[1][s]).append(" ");
        }
        System.out.print(sb);
    }
}