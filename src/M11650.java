import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class M11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int[][] array = new int[n][2];

        for(int i = 0;i < n;i++) {
            st = new StringTokenizer(bf.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] s1, int[] s2) {
                if(s1[0] == s2[0])  return s1[1] - s2[1];
                else                return s1[0] - s2[0];
            }
        });

        for(int i = 0;i < array.length;i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}