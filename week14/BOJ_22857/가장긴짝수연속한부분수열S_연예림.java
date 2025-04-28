package BOJ_22857;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 가장긴짝수연속한부분수열S_연예림 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수열 길이
        int K = Integer.parseInt(st.nextToken());// 제거할 수 있는 홀수 개수

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0;
        int oddCount = 0; // 현재 구간 내 홀수 개수
        int maxLen = 0;

        while (end < N) { // 오른쪽 포인터가 배열 끝까지 갈 때까지
            if (arr[end] % 2 == 1) { // end가 홀수면
                oddCount++;
            }

            while (oddCount > K) { // 홀수 개수가 k 보다 커지면
                if (arr[start] % 2 == 1) { // start가 홀수면 다시
                    oddCount--;
                }
                start++; // start 포인터를 오른쪽으로 옮긴다.
            }

            // 현재 구간에서 짝수의 개수는 (right - start + 1 - 홀수 개수)
            maxLen = Math.max(maxLen, end - start + 1 - oddCount); // 현재 최대 짝수 개수와 비교
            end++; //  오른쪽 포인터 이동
        }

        System.out.println(maxLen);
    }
}

