import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class M1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        String[] str = new String[n];

        for(int i = 0;i < n;i++) {
            str[i] = bf.readLine();
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });

        for(int i = 0;i < n;i++) {
            int result = 0;
            for(int j = 0;j < n;j++) {
                if(str[i].equals(str[j]))
                    result++;
            }
            if(result > 1)  str[i] = "";
        }

        for(int i = 0;i < n;i++) {
            if(!(str[i].equals(""))) System.out.println(str[i]);
        }
    }
}