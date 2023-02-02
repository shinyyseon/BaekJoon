import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 성지키기
public class M1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n, m = 0;
        int count1 = 0, count2 = 0;
        int save = 0;
        int result = 0;
        String[] line = new String[50];
        String[][] castle = new String[50][50];

        //배열의 크기 설정
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        //입력받은 값 2차원 배열로 저장
        for(int i=0; i<n; i++) {
            String[] a = bf.readLine().split("");

            for(int j=0; j< a.length; j++) {
                castle[i][j] = a[j];
            }
        }

        //배열 체크
        for(int i = 0;i < n;i++) {
            for(int j =0;j < m;j++) {
                if(!(castle[i][j].equals("X"))) {
                    save++;
                }
                if(save == m) {
                    count1++;
                }
            }
            save = 0;
        }

        //배열 체크
        for(int j = 0;j < m;j++) {
            for(int i = 0;i < n;i++) {
                if(!(castle[i][j].equals("X"))) {
                    save++;
                }
                if(save == n) {
                    count2++;
                }
            }
            save = 0;
        }

        if(count1 < count2) result = count2;
        else                result = count1;
        System.out.print(result);
    }
}