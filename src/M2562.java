import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] num = new int[9];
        int[] result = new int[2];
        Arrays.fill(result, 0);

        for(int i = 0;i < 9;i++) {
            st = new StringTokenizer(bf.readLine());
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0;i < 9;i++) {
            if(result[0] < num[i]) {
                result[0] = num[i];
                result[1] = i + 1;
            }
        }
        System.out.print(result[0] + "\n" + result[1]);
    }
}