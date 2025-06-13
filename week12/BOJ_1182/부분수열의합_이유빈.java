package BOJ_1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의합_이유빈 {

  static int n;
  static int s;
  static int[] arr;
  static int count = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    s = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    arr = new int[n];
    for (int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    dfs(0, 0);
    if (s == 0) System.out.println(count - 1);
    else System.out.println(count);
  }

  static void dfs(int depth, int sum) {
    if (depth == n) {
      if (sum == s) {
        count ++;
      }
      return;
    }

    dfs(depth+1, sum+arr[depth]);
    dfs(depth+1, sum);
  }
}
