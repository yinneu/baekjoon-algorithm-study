package BOJ_14888;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 연산자끼워넣기_박유진 {

  public static int MAX = Integer.MIN_VALUE;	// 최댓값
  public static int MIN = Integer.MAX_VALUE;	// 최솟값
  public static int[] operator = new int[4];	// 연산자 개수
  public static int[] number;					// 숫자
  public static int N;						// 숫자 개수

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    N = Integer.parseInt(br.readLine());
    number = new int[N];

    // 숫자 입력
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      number[i] = Integer.parseInt(st.nextToken());
    }

    // 연산자 입력
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < 4; i++) {
      operator[i] = Integer.parseInt(st.nextToken());
    }

    solu(number[0], 1);

    System.out.println(MAX);
    System.out.println(MIN);

  }

  public static void solu(int num, int idx) {
    if (idx == N) {
      MAX = Math.max(MAX, num);
      MIN = Math.min(MIN, num);
      return;
    }

    for (int i = 0; i < 4; i++) {
      // 연산자 개수가 1개 이상인 경우
      if (operator[i] > 0) {

        // 해당 연산자를 1 감소시킨다.
        operator[i]--;

        switch (i) {

          case 0:	solu(num + number[idx], idx + 1);	break;
          case 1:	solu(num - number[idx], idx + 1);	break;
          case 2:	solu(num * number[idx], idx + 1);	break;
          case 3:	solu(num / number[idx], idx + 1);	break;

        }
        // 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
        operator[i]++;
      }
    }
  }

}
