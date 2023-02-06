import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //입력
        int n = Integer.parseInt(bf.readLine());

        //출력
        for(int i = 0;i < n;i++){
            for(int j = 0;j < i;j++)
                System.out.print(" ");
            for(int j = 0;j < n - i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}