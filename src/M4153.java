import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.pow;

public class M4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0)      break;
            if(pow(a, 2) == pow(b,2) + pow(c, 2))           System.out.println("right");
            else if(pow(b, 2) == pow(a,2) + pow(c, 2))      System.out.println("right");
            else if(pow(a, 2) + pow(b, 2) == pow(c,2))      System.out.println("right");
            else                                            System.out.println("wrong");
        }
    }
}