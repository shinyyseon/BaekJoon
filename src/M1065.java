import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 한수구하기
public class M1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int[] num = new int[3];
        int count = 0;
        int total = 0;
        float d;
        int same = 0;

        //정수 입력
        n = Integer.parseInt(bf.readLine());

        //한수 구하기
        for(int i = 1;i <= n;i++) {
            if(i < 100)        count++;
            if(i >= 100) {
                total = i;
                for(int j = 0;j < 3;j++) {
                    num[j] = total % 10;
                    total /= 10;
                }
                d = ((num[0] - num[2]) / 2.0F);
                same = (int) d;

                if(num[1] + d == num[0]) {
                    count++;
                }
                if(i == 1000) count -= 1;
            }
        }

        //한수 출력
        System.out.print(count);
    }
}