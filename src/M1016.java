import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long count = 0, result = 0, total = 0;
        long check = 0;
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        long[] prime = new long[(int) (min + 1000000)];

        //소수 구하기
        for(long i = 2, index = 0;i<=max;i++) {
            for(long j = 2;j<=i;j++)
                if(i%j == 0)      check ++;
            if(check == 1)        prime[(int) index] = i;
            check = 0;
            index++;
        }

        for( ;min <= max;min++){
            for(long i : prime) {
                result = min % prime[(int) i];
                if (result == 0) count++;
                total++;
            }
        }

        System.out.print(total - count);
    }
}