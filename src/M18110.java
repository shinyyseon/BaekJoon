import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] op = new int[N];

        for(int i = 0;i < N;i++) {
            st = new StringTokenizer(br.readLine());
            op[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(op);

        float sum = 0;
        //절사평균
        int avg = (int) Math.round(N * 0.15);

        for(int i = avg;i < N - avg;i++) {
            sum = sum + op[i];
        }
        int total = Math.round(sum / (N-(avg*2)));
        System.out.println(total);
    }
}
