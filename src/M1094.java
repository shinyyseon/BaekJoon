import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bf.readLine());
        int stick = 64;
        int[] cut = new int[8];
        int result = 0;

        while(x > stick) {
            if(stick / 2 >= x) {
                result++;
                break;

            }
        }


        if(x  == stick)     result++;
        System.out.print(result);
    }
}
