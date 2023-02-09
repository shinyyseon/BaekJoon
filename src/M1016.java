import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class M1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long count = 0;
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        boolean[] num = new boolean[Math.toIntExact((max + 1))];
        Arrays.fill(num, true);

        for(long i = min;i <= max;i++) {
            long sqrt = (long) Math.sqrt(i);
            //제곱ㄴㄴ수 판별
            if(sqrt == 1) {
                if(!(num[(int) i - 1])) {
                    num[(int) i - 1] = true;
                }
            }
            else {
                for(long temp = i;temp <= max;temp++) {
                    if(temp % (sqrt * sqrt) == 0) {
                        if(num[(int) temp - 1]) {
                            num[(int) temp - 1] = false;
                        }
                    }
                    else {
                        if(num[(int) temp - 1]) {
                            //제곱ㄴㄴ 수
                            num[(int) temp - 1] = true;
                        }
                    }
                }
            }
        }

        for( ;min <= max;min++) {
            if(min == max) {
                if(num[(int) min - 1]){
                    count++;
                    System.out.println(min);
                }
            }
            else {
                if(num[(int) min - 1]){
                    count++;
                    System.out.println(min);
                }
            }
        }
        System.out.print(count);
    }
}