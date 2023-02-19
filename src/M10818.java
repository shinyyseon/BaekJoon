import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] num = bf.readLine().split(" ");
        int max = -1000000, min = 1000000;

        for(int i = 0;i < n;i++) {
            if(max < Integer.parseInt(num[i])) max = Integer.parseInt(num[i]);
            if(min > Integer.parseInt(num[i])) min = Integer.parseInt(num[i]);
        }

        System.out.print(min + " " + max);
    }
}