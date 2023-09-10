import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class M9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0;i < N;i++) {
            String[] S = bf.readLine().split("");

            for(int j = 0;j < S.length;j++) {
                if(S[j].contains("("))  stack.push(S[j]);
                else if(stack.empty())  System.out.println("NO");
                else                    stack.pop();
            }

            if(stack.empty() == true)   System.out.println("YES");
            else                        System.out.println("NO");
        }
    }
}