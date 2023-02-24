import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];
        boolean[] count = new boolean[42];
        Arrays.fill(count, false);
        int total = 0;

        for(int i = 0;i < 10;i++) {
            num[i] = Integer.parseInt(bf.readLine());
            num[i] %= 42;
        }

        for(int i = 0;i < 10;i++)
            for(int j = 0;j < 10;j++)
                if(num[i] == num[j])    count[num[i]] = true;

        for(int i = 0;i < 42;i++)
            if(count[i] == true) total++;

        System.out.print(total);
    }
}