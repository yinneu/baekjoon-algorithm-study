package BOJ_11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2xn타일링2_연예림 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] comp = new int[1001];
        comp[1] = 1;

        if (n >= 2) {
            comp[2] = 3;
            for (int i = 3; i < n+1; i++) {
                comp[i] = (comp[i-2] * 2) + comp[i-1];
            }
        }

        System.out.println(comp[n]);
    }
}
