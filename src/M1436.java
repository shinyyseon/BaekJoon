import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int num = 666;
        int count = 0;

        while(true) {
            if(String.valueOf(num).contains("666"))  count++;
            if(count == N)  break;
            num++;
        }

        System.out.print(num);
    }
}