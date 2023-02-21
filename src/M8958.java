import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] sum = new int[n+1];
        Arrays.fill(sum,0);

        for(int i = 0, count = 1;i < n;i++) {
            String[] temp = bf.readLine().split("");
            for(int j = 0;j < temp.length;j++) {
                if(temp[j].equals("O")) {
                    sum[i] += count;
                    count++;
                }
                if(temp[j].equals("X")) {
                    count = 1;
                }
            }
            count = 1;
        }
        for(int i = 0;i < n;i++)
            System.out.println(sum[i]);
    }
}