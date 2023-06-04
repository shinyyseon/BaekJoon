import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class M10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(bf.readLine());

        for(int i = 0;i < N;i++) {
            String[] D = bf.readLine().split(" ");

            switch (D[0]) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(D[1]));
                break;
                case "push_back":
                    deque.addLast(Integer.parseInt(D[1]));
                break;
                case "pop_front":
                    if(deque.size() == 0)           System.out.println("-1");
                    else                            System.out.println(deque.pollFirst());
                break;
                case "pop_back":
                    if(deque.size() == 0)           System.out.println("-1");
                    else                            System.out.println(deque.pollLast());
                break;
                case "size":
                    System.out.println(deque.size());
                break;
                case "empty":
                    if(deque.isEmpty() == false)    System.out.println("0");
                    else                            System.out.println("1");
                break;
                case "front":
                    if(deque.size() == 0)           System.out.println("-1");
                    else                            System.out.println(deque.peekFirst());
                break;
                case "back":
                    if(deque.size() == 0)           System.out.println("-1");
                    else                            System.out.println(deque.peekLast());
                break;
            }
        }
    }
}