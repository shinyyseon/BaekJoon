import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long count = 0, result = 0, total = 0;
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        //제곱ㄴㄴ 수 구하기
        for(long temp = min;temp <= max;temp++) {
            for(long i = 2, square = i * i;square < max;i++){
                square = i * i;
                if(square > max) break;
                if(temp % square == 0)  count++;
            }
            if(count > 0) result++;
            total++;
            count = 0;
        }
        System.out.print(total - result);
    }
}