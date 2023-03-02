import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] array = new boolean[n+1];
        Arrays.fill(array, true);
        array[0] = false; array[1] = false;

        for(int i = 2;i * i < array.length;i++) {
            for(int j = i + i;j < array.length;j += i) {
                array[j] = false;
            }
        }

        for(int i = m;i < array.length;i++) {
            if(array[i]) System.out.println(i);
        }
    }
}