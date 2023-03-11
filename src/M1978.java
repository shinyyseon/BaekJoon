import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] array = bf.readLine().split(" ");

        for(int i = 2;i < n;i++) {
            int count = 0;
            for(int j = 2;j < i;j++) {
                if(i % j == 0)  count++;
            }
            if(count > 1)   array[i] = "0";
        }

        for(int i = 0;i < array.length;i++) {
            System.out.println(array[i]);
        }
     }
}