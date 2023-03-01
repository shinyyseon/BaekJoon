import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String n = bf.readLine();
            String[] temp = n.split("");
            String result = "";

            for(int i = temp.length - 1, j = 0;i >= 0;i--) {
                result += temp[i];
            }

            if(n.equals("0"))   break;
            if(result.equals(n))    System.out.println("yes");
            else                System.out.println("no");
        }
    }
}