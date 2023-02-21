import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        if(n > 89)      System.out.print("A");
        else if(n > 79) System.out.print("B");
        else if(n > 69) System.out.print("C");
        else if(n > 59) System.out.print("D");
        else            System.out.print("F");
    }
}