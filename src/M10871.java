import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] a = bf.readLine().split(" ");
        int[] result = new int[n];
        Arrays.fill(result, 0);

        for(int i = 0, count = 0;i < n;i++) {
            if(Integer.parseInt(a[i]) < x) {
                result[count] = Integer.parseInt(a[i]);
                count++;
            }
        }

        for(int i = 0;i < n;i++) {
            if(result[i] != 0)  System.out.print(result[i] + " ");
            else                break;
        }
    }
}