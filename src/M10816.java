import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int N = Integer.parseInt(bf.readLine());
        int[] s1 = new int[N];
        for(int i = 0;i < N;i++) {
            s1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(s1);

        int M = Integer.parseInt(bf.readLine());

        for(int i = 0;i < N;i++)
            System.out.print(s1[i] + " ");

        System.out.println();
        for(int i = 0;i < M;i++) {
            int count = 0;
            int s = Integer.parseInt(st.nextToken());
            for(int j = 0;j < N;j++) {
                if(s1[j] > s) {
                    break;
                }
                if(s == s1[j])     count++;
            }
            sb.append(count + " ");
        }
        System.out.print(sb);
    }
}