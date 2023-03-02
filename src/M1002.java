import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class M1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        for(int i = 0;i < n;i++) {
            st = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int d = (int) (Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));

            if(x1 == x2 && y1 == y2 && r1 == r2)                                      System.out.println("-1"); //원이 같을 때 즉, 무한대
            else if(Math.pow(r1 + r2, 2) == d || Math.pow(r2 - r1, 2) == d)           System.out.println("1"); //원이 한점에서 만날때
            else if(d == 0 || Math.pow(r1 + r2, 2) < d || Math.pow(r2 - r1, 2) > d)   System.out.println("0"); //원이 서로 안만날때
            else                                                                      System.out.println("2"); //원이 두점에서 만날때
        }
    }
}