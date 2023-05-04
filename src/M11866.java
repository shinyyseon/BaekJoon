import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class M11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> array= new ArrayList<>(N);

        for(int i = 0;i < N;i++)
            array.add(i+1);

        sb.append("<");
        int count = 0;
        int index = 0;

        while(true) {
            //index += K;

            index = (index + (K - 1)) % array.size();

            sb.append(array.get(index));
            array.remove(index);
            count++;

            if(count == N)
                break;
            else
                sb.append(", ");
        }
        sb.append(">");

        System.out.print(sb);
    }
}