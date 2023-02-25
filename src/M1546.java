import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] score = bf.readLine().split(" ");
        int maxScore = 0;
        double avg = 0.0;

        for(int i = 0;i < n;i++)
            if(maxScore < Integer.parseInt(score[i])) maxScore = Integer.parseInt(score[i]);

        for(int i = 0;i < n;i++)
            avg += (Integer.parseInt(score[i]) / (double) maxScore * 100.0);

        avg /= n;

        System.out.print(avg);
    }
}