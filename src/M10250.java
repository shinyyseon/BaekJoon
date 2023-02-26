import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());
        int[] result = new int[T];
        Arrays.fill(result, 0);

        for(int i = 0;i < T;i++) {
            st = new StringTokenizer(bf.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            for(int j = 1, layer = 1, row = 1;j <= n;j++) {
                if(layer <= h || j <= w) {
                    result[i] = layer * 100 + row;
                    layer++;
                }
                if(layer > h) {
                    layer = 1;
                    row++;
                }
            }
        }
        for(int i = 0;i < result.length;i++)    System.out.println(result[i]);
    }
}