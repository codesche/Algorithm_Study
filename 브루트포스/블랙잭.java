
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = search(arr, N, M);
        System.out.println(result);
    }

    // 탐색
    static int search(int[] arr, int N, int M) {
        int result = 0;

        // 첫번째 카드 순회는 N - 2까지 진행
        for (int i = 0; i < N - 2; i++) {
          // 두번째 카드 순회는 첫번째 이후부터 N - 1까지 순회
            for (int j = i + 1; j < N - 1; j++) {
              // 세번째 카드는 두번째 이후부터 N까지 순회
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    
                    // 3장의 합이 같으면 return
                    if (M == temp) {
                        return temp;
                    }
                    
                    // result가 temp와 M사이의 값이면 result를 갱신해줌
                    if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        // 모든 순회 종료 후 리턴
        return result;
    }
}
