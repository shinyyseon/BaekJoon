import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class M10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(bf.readLine());

        for(int i = 0;i < N;i++) {
            String[] Q = bf.readLine().split(" ");

            switch (Q[0]) {
                case "push":
                    stack.push(Integer.parseInt(Q[1]));
                break;
                case "pop":
                    if(stack.size() == 0)       System.out.println("-1");
                    else                        System.out.println(stack.pop());
                break;
                case "size":
                    System.out.println(stack.size());
                break;
                case "empty":
                    if(stack.empty() == false)  System.out.println("0");
                    else                        System.out.println("1");
                break;
                case "top":
                    if(stack.size() == 0)       System.out.println("-1");
                    else                        System.out.println(stack.peek());
                break;
            }
        }
    }
}
