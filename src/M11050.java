import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int nFactory = 1;
        int kFactory = 1;
        int temp = 1;

        for(int i = 1;i <= n;i++)
            nFactory *= i;

        for(int i = 1;i <=k;i++)
            kFactory *= i;

        for(int i = 1;i <= n-k;i++)
            temp *= i;

        System.out.print(nFactory / (kFactory * temp));
    }
}