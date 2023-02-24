import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[3];
        int[] check = new int[10];
        Arrays.fill(check, 0);
        int result = 1;

        for(int i = 0;i < 3;i++) {
            n[i] = Integer.parseInt(bf.readLine());
            result *= n[i];
        }
        String num[] = String.valueOf(result).split("");

        for(int i = 0;i < num.length;i++) {
            check[Integer.parseInt(num[i])]++;
        }

        for(int i = 0;i < 10;i++) {
            System.out.println(check[i]);
        }
    }
}