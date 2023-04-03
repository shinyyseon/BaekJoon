import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {

        int list_size = 5; // 배열 사이즈
        int[] list = new int[list_size]; // 배열의 크기가 5인 배열을 생성
        int count = 0; // 배열 원소가 이동할 때 마다 count

        for(int j = 0; j < 5; j++) {
            list[j] = j+1; // 인덱스가 i일 때 배열 값은 i+1을 넣는다.
        }

        for(int i = 1; i < list.length-1; i++) { // 우리가 삭제하고 싶은 인덱스 값부터 마지막 인덱스까지 반복문을 돌린다.
            list[i] = list[i+1];  // 인덱스 i+1의 값을 인덱스 i로 이동
            count++;  // 이동할 때마다 count 증가
        }

        System.out.println(count); // counting을 확인한다.
        System.out.println(list[1]); // 우리가 원하는 배열 값을 확인한다.

        for(int i : list)   System.out.print(i + " ");

       /* BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n + 1];

        for(int i = 0;i < n;i++) {
            array[i] = i + 1;
        }

        array[3] = 0;

        for(int i = 0;i < n;i++) {
            if(array[i] == 0) {
                array[i] = array[i + 1];
                array[i + 1] = 0;
                //n -= 1;
            }
        }

        for(int i : array) {
            System.out.print(i + " ");
        }*/
    }
}