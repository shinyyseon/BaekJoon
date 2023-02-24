import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] n1 = String.valueOf(n).split("");
        String[] m1 = String.valueOf(m).split("");

        n = (Integer.parseInt(n1[2]) * 100) + (Integer.parseInt(n1[1]) * 10) + Integer.parseInt(n1[0]);
        m = (Integer.parseInt(m1[2]) * 100) + (Integer.parseInt(m1[1]) * 10) + Integer.parseInt(m1[0]);

        if(n > m)   System.out.print(n);
        else        System.out.print(m);
    }
}