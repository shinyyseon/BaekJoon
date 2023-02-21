import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        if(n % 4 == 0 && n % 100 != 0) System.out.print("1");
        else if(n % 400 == 0)          System.out.print("1");
        else                           System.out.print("0");
    }
}