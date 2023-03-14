import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        String[] A = bf.readLine().split(" ");
        Arrays.sort(A);

        int M = Integer.parseInt(bf.readLine());
        String[] array = bf.readLine().split(" ");
        Arrays.sort(array);

        for(int i = 0;i < N;i++) {
            int count = 0;
            for(int j = 0;j < N;j++) {
                if(array[i].equals(A[j])) {
                    sb.append("1").append("\n");
                    break;
                }
                else if(Integer.parseInt(A[i]) > Integer.parseInt(array[j])) {
                    count++;
                    break;
                }
                if(count > 1) {
                    sb.append("0").append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}