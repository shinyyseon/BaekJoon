import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        String n = bf.readLine();
        String[] line = n.split(" ");

        for(int i = 0;i < line.length;i++) {
            if(line[i].equals(""))   continue;
            else                     count++;
        }
        System.out.print(count);
    }
}