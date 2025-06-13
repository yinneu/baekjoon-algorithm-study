package BOJ_10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱_한성지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
        // Deque 인터페이스 통해 deque 구현
        // Deque 인터페이스는 Queue 인터페이스 상속받음
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front" :
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back" :
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front" :
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;

                case "pop_back" :
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;

                case "size" :
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty" :
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front" :
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;

                case "back" :
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}