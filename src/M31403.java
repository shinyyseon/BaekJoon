import javax.swing.text.Style;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input_A = br.readLine();
        String input_B = br.readLine();
        String input_C = br.readLine();

        int A = Integer.parseInt(input_A);
        int B = Integer.parseInt(input_B);
        int C = Integer.parseInt(input_C);

        System.out.println(A + B - C);
        String S_AB = input_A + input_B;
        int I_AB = Integer.parseInt(S_AB);
        System.out.println(I_AB - C);
    }
}