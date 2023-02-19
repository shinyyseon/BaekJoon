import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] sum = new int[n];
        Arrays.fill(sum,0);
        int count = 1;

        for(int i = 0;i < n;i++) {
            String[] temp = bf.readLine().split("");
            for(int j = 0;j < temp.length;j++) {
                if(temp[j].equals("O")) {
                    sum[i] = count + sum[i];
                    count++;
                    for(int k = j + 1;k < temp.length;k++) {
                        if(temp[k].equals("O")) {
                            sum[i] = count + sum[i];
                            count++;
                        }
                        else {
                            count = 1;
                            j = k;
                            break;
                        }
                    }
                }
                else continue;
            }
        }

        for(int i = 0;i < n;i++)
            System.out.println(sum[i]);
    }
}