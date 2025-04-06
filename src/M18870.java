import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class M18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] input_X = br.readLine().split(" ");
        int[] X_original = new int[N];
        int[] X_clone = new int[N];

        for (int i = 0; i < N; i++) {
            X_original[i] = Integer.parseInt(input_X[i]);
            X_clone[i] = X_original[i];
        }

        Arrays.sort(X_clone);

        int[] X_unique = Arrays.stream(X_clone).distinct().toArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int compressed = Arrays.binarySearch(X_unique, X_original[i]);
            sb.append(compressed).append(" ");
        }

        System.out.println(sb);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] X_original = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            X_original[i] = Integer.parseInt(st.nextToken());
        }

        int[] X_clone = X_original.clone();
        Arrays.sort(X_clone);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int num : X_clone) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(map.get(X_original[i])).append(" ");
        }

        System.out.println(sb);
    }
}


*/
