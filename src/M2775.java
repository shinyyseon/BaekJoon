import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());
        int k, n;
        int[] num = new int[T];

        //층과 호 입력받기
        for(int i = 0;i < T;i++) {
            k = Integer.parseInt(bf.readLine());
            n = Integer.parseInt(bf.readLine());

            int[] temp = new int[n + 1];


            //계산
            for(int layer = 0;layer < k;layer++) {
                int sum = 0;
                for(int j = 1;j <= n;j++) {
                    if(layer == 0) {
                        sum += j;
                        temp[j] = sum; // 0층의 사람수를 알 수 있음;
                    }
                    else {
                        sum += temp[j];
                        temp[j] = sum;
                    }
                }
                num[i] = sum;
            }
        }

        for(int i = 0;i < T;i++)
            System.out.println(num[i]);
    }
}