import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] array = new int[N + 1];
        int temp = 0, count = 0;

        for(int i = 0;i < N;i++)    array[i] = i + 1;

        sb.append("<");

        //ArrayList 사용해서 풀어볼 것
        //해당 인덱스 삭제 (remove() 명령어 사용)
        while(true) {
            for(int i = 1;i <= K;i++) {
                if(temp == N - 1)       temp = 0;

                if(i == 3) {
                    sb.append(array[temp]);
                    array[temp] = 0;
                    for(int j = 0;j < N;j++) {
                        if(array[j] == 0) {
                            array[j] = array[j + 1];
                            array[j + 1] = 0;
                            N -= 1;
                        }
                    }
                    count++;
                }
                temp++;
            }
            for(int i = 0;i < N;i++) {
                System.out.println("\n" + array[i] + "\n");
            }
            if(count == N)  break;
            else sb.append(", ");
        }

        sb.append(">");

        System.out.println(sb);
    }
}