import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String n = bf.readLine();
        char[] alpha = n.toCharArray();
        int[] count = new int[26];
        Arrays.fill(count, -1);

        for(int i = 0, ct = 0;i < alpha.length;i++) {
            if(count[(int) alpha[i] - 97] == -1) count[(int) alpha[i] - 97] = ct;
            ct++;
        }
        for(int i = 0;i < count.length;i++)
            System.out.print(count[i] + " ");
    }
}