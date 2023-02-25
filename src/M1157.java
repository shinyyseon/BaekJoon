import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine().toUpperCase();
        String[] alpha = n.split("");
        int[] count = new int[26];
        int resultcount = 0, result = 0, check = 0;
        String  resultString= "";

        for(int i = 0;i < alpha.length;i++) {
            char al = alpha[i].charAt(0);
            count[(int) al - 65]++;
        }

        for(int i = 0;i < count.length;i++) {
            if(count[i] > resultcount)       {
                resultcount = count[i];
                result = i;
            }
        }

        for(int i = 0;i < count.length;i++) {
            if(count[i] == resultcount)
                check++;
        }

        if(check > 1)                   resultString = "?";


        if(resultString.equals("?"))    System.out.print(resultString);
        else                            System.out.print((char) (result + 65));
    }
}