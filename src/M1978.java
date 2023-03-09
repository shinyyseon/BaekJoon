import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class M1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(bf.readLine());
        String[] array = new String[n+1];
        Arrays.fill(array, "0");
        array[0] = "0"; array[1] = "0";

        for(int i = 0;i < n;i++) {
            array[i] = Arrays.toString(bf.readLine().split(" "));
        }

        for(int i = 2;i * i < array.length;i++) {
            for(int j = i + i;j < array.length;j += i) {
                array[j] = "0";
            }
        }
    }
}
//test