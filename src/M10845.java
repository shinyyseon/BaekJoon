import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class M10845 {
    public static void main(String[] arg) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(bf.readLine());
        int last = 0;

        for(int i = 0;i < N;i++) {
            String[] Q = bf.readLine().split(" ");

            switch (Q[0]) {
                case "push" :
                    last = Integer.parseInt(Q[1]);
                    queue.add(last);
                break;
                case "pop" :
                    if(queue.size() == 0)           System.out.println("-1");
                    else                            System.out.println(queue.poll());
                break;
                case "size" :
                    System.out.println(queue.size());
                break;
                case "empty":
                    if(queue.isEmpty() == false)    System.out.println("0");
                    else                            System.out.println("1");
                break;
                case "front":
                    if(queue.size() == 0)           System.out.println("-1");
                    else                            System.out.println(queue.peek());
                break;
                case "back":
                    if(queue.size() == 0)           System.out.println("-1");
                    else                            System.out.println(last);
                break;
            }
        }
    }
}
