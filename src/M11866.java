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
        boolean[] array = new boolean[N];
        int temp = 0;

        sb.append("<");

        while(true) {
            temp += 3;
            for(int i = 0;i < N;i++) {
                if(temp > N) {

                }
                else {
                    array[temp + 1] = false;
                }
            }
        }
    }
}