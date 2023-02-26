import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[] result = new int[4];
        int min = 1001;

        result[0] = x;
        result[1] = y;
        result[2] = w - x;
        result[3] = h - y;

        for(int i = 0;i < 4;i++) {
            if(min > result[i])     min = result[i];
        }

        System.out.print(min);
    }
}