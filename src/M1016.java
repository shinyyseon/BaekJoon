import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class M1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long check = 0, count = 0;
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        boolean[] num = new boolean[Math.toIntExact((max + 1))];
        Arrays.fill(num, false);

        //제곱ㄴㄴ 수 구하기
        if(min >= 1 && max >= min) {
            for(long i = 2;i <= max;i++) {
                for(long j = 2;j <= i;j++)
                    if(i % j == 0)      check ++;
                if(check == 1) {
                    for(long temp = min;temp <= max;temp++) {
                        if(temp % (i * i) == 0) {
                            if(!(num[(int) temp - 1])) {
                                num[(int) temp - 1] = true;
                            }
                        }
                    }
                }
                check = 0;
            }

            for( ;min <= max;min++) {
                if(min == max) {
                    if(!(num[(int) min - 1])){
                        count++;
                    }
                }
                else {
                    if(!(num[(int) min])) count++;
                }
            }
            System.out.print(count);
        }
    }
}