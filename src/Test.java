import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] str = new String[n];

        for(int i = 0;i < n;i++) {
            str[i] = bf.readLine();
            System.out.println(Integer.parseInt(str[i]));
        }

        Arrays.sort(str);

        for(int i = 0;i < n;i++) {
            System.out.println(str[i]);
        }
    }
}