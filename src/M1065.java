import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 한수구하기
public class M1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int sum = 0;
        int i = 1;
        int count = 0;

        //정수 입력
        n = Integer.parseInt(bf.readLine());
        
        //정수가 1일 때
        if(n == 1)      count = 1;

        //정수가 1보다 클 때
        if(n > 1) {
            while(true) {
                sum = sum + i;
                if(sum == n) {
                    count++;
                    i++;
                    sum = 0;
                }
                else if(sum > n){
                    i++;
                    sum = 0;
                    continue;
                }
                else {
                    i++;
                    sum = 0;
                    continue;
                }

                if(i > n) {
                    break;
                }
            }
        }

        //한수 출력
        System.out.print(count);
    }
}
