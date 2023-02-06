import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0;i < n;i++){
            for(int j = 0;j < i;j++)
                System.out.print(" ");
            for(int j = 0;j < n - i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}