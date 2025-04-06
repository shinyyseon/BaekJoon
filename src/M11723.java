import java.io.*;
import java.util.Arrays;

public class M11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        boolean[] S = new boolean[21];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            int index = 0;
            if (input.length > 1) {
                index = Integer.parseInt(input[1]);
            }

            switch (command) {
                case "add":
                    S[index] = true;
                    break;
                case "remove":
                    S[index] = false;
                    break;
                case "check":
                    sb.append(S[index] ? "1\n" : "0\n");
                    break;
                case "toggle":
                    S[index] = !S[index];
                    break;
                case "all":
                    Arrays.fill(S, true);
                    break;
                case "empty":
                    Arrays.fill(S, false);
                    break;
            }
        }

        System.out.print(sb);
    }
}
