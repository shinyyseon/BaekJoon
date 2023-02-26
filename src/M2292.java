import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in) );
        int n = Integer.parseInt(bf.readLine());
        int num = 1, count = 1;

        for(int i = 1;i <= n;i++) {
            num += i * 6;
            if(n == 1)   break;
            if(num >= n)  {
                count++;
                break;
            }
            else count++;
        }
        System.out.print(count);
    }
}