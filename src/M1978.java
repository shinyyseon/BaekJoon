import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] array = bf.readLine().split(" ");
        int result = 0;

        for(int i = 0;i < n;i++) {
            int count = 0;
            if(Integer.parseInt(array[i]) == 1 || Integer.parseInt(array[i]) == 0) {
                array[i] = "0";
                continue;
            }
            for(int j = 2;j <= Integer.parseInt(array[i]);j++) {
                if(Integer.parseInt(array[i]) % j == 0)
                    count++;
            }
            if(count > 1)                   array[i] = "0";
        }

        for(String i : array) {
            if(Integer.parseInt(i) != 0)    result++;
        }

        System.out.print(result);
     }
}