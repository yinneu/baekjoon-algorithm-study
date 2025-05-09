package BOJ_11441;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 합구하기_연예림 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    int[] sums = new int[N+1];

    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      sums[i] += sums[i-1] + Integer.parseInt(st.nextToken());
    }

    int M = Integer.parseInt(br.readLine());
    for (int i = 1; i <= M; i++) {
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      sb.append(sums[b]-sums[a-1]).append("\n");
    }
    System.out.println(sb);
  }
}
