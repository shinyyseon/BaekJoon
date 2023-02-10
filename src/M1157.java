import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();
        String[] str = n.split("");
        String result = " ";
        int[] count = new int[str.length];
        int num = 0;
        Arrays.fill(count, 0);

        for(int i = 0;i < str.length;i++)
            str[i] = str[i].toUpperCase();

        for(int i = 0;i < str.length;i++)
            for(int j = 0;j < str.length;j++)
                if(str[i].equals(str[j]))   count[i]++;

        for(int i = 0,max = 0;i < str.length;i++) {
            if(count[i] > max)  {
                max = count[i];
                num = i;
            }
        }

        for(int i = 0;i < str.length;i++) {
            for(int j = 0;j < str.length;j++) {
                if(count[i] == count[j] && !(str[i].equals(str[j])))
                    result = "?";
            }
        }
        if(result.equals("?"))
            System.out.print(result);
        else
            System.out.print(str[num]);
    }
}