import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] N = bf.readLine().split("");
        int I = Integer.parseInt(bf.readLine());

        System.out.print(N[I-1]);
    }
}