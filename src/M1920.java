import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] array = new int[N];
        String[] A = bf.readLine().split(" ");

        for(int i = 0;i < N;i++)
            array[i] = Integer.parseInt(A[i]);

        Arrays.sort(array);

        int M = Integer.parseInt(bf.readLine());
        String[] x = bf.readLine().split(" ");

        for(int i = 0;i < M;i++) {
            int target = Integer.parseInt(x[i]);
            int result = 0;
            int start = 0, end = N - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if(array[mid] == target) {
                    result = 1;
                    break;
                }
                else if(array[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            System.out.println(result);
        }
    }
}
/**/
/**/
/**/