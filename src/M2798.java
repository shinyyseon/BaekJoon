import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] num = bf.readLine().split(" ");
        int sum, result = 0, max = 0;

        for(int i = 0;i < n;i++) {
            for(int j = 1;j < n;j++) {
                for(int k = 2;k < n;k++) {
                    if(num[i].equals(num[j]) || num[j].equals(num[k]) || num[i].equals(num[k])) continue;
                    sum = Integer.parseInt(num[i]) + Integer.parseInt(num[j]) + Integer.parseInt(num[k]);
                    if(sum <= m)        max = sum;
                    if(result < max)    result = max;
                }
            }
        }
        System.out.print(result);
    }
}