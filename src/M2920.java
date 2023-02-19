import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] n = bf.readLine().split(" ");
        int count = 0;

        for(int i = 0;i < n.length;i++) {
            if(Integer.parseInt(n[i]) == i + 1) count++;
            if(Integer.parseInt(n[i]) == 8 - i) count--;
        }
        if(count == 8)       System.out.print("ascending");
        else if(count == -8) System.out.print("descending");
        else                 System.out.print("mixed");
    }
}