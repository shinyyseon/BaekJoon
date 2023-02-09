import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] resistance = new String[3];
        long[] result = new long[3];
        long total;

        for(int i = 0;i < 3;i++) {
            resistance[i] = bf.readLine();
            if(i != 2) {
                switch (resistance[i]) {
                    case "black":
                        result[i] = 0;
                        break;

                    case "brown":
                        result[i] = 1;
                        break;

                    case "red":
                        result[i] = 2;
                        break;

                    case "orange":
                        result[i] = 3;
                        break;

                    case "yellow":
                        result[i] = 4;
                        break;

                    case "green":
                        result[i] = 5;
                        break;

                    case "blue":
                        result[i] = 6;
                        break;

                    case "violet":
                        result[i] = 7;
                        break;

                    case "grey":
                        result[i] = 8;
                        break;

                    case "white":
                        result[i] = 9;
                        break;
                }
            }
            else {
                switch (resistance[i]) {
                    case "black":
                        result[i] = 1;
                        break;

                    case "brown":
                        result[i] = 10;
                        break;

                    case "red":
                        result[i] = 100;
                        break;

                    case "orange":
                        result[i] = 1000;
                        break;

                    case "yellow":
                        result[i] = 10000;
                        break;

                    case "green":
                        result[i] = 100000;
                        break;

                    case "blue":
                        result[i] = 1000000;
                        break;

                    case "violet":
                        result[i] = 10000000;
                        break;

                    case "grey":
                        result[i] = 100000000;
                        break;

                    case "white":
                        result[i] = 1000000000;
                        break;
                }
            }
        }
        total = (result[0] * result[2] * 10) + (result[1] * result[2]);
        System.out.print(total);
    }
}