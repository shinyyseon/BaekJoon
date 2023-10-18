import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class M9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        for(int i = 0;i < n;i++) {
            String[] s = bf.readLine().split("");
            Stack<String> stack = new Stack<>();

            for(int j =0;j < s.length;j++) {
                if(s[j].equals("(")) {
                    stack.push(s[j]);
                }
                else if(stack.empty()) {
                    stack.push(s[j]);
                    break;
                }
                else {
                    stack.pop();
                }
            }
            if(stack.empty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
