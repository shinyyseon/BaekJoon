import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        String[] A = bf.readLine().split(" ");

        int M = Integer.parseInt(bf.readLine());
        String[] array = bf.readLine().split(" ");

        for(int i = 0;i < N;i++) {
            int count = 0;
            for(int j = 0;j < N;j++) {
                if(array[i].equals(A[j])) {
                    sb.append("1").append("\n");
                    break;
                }
                else count++;
            }
            if(count == N)   sb.append("0").append("\n");
        }
        System.out.print(sb);
    }
}