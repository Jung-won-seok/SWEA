import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea_1225 {
    static Queue<Integer> queue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            queue = new LinkedList<>();
            for (int i = 0; i < 8; i++) {
                queue.offer(sc.nextInt());
            }
            solve();
            System.out.println("#"+test_case+" ");
            for (int i = 0; i < 8; i++) {
                System.out.print(queue.poll()+" ");
            }
            System.out.println();
        }
    }

    private static void solve() {
        int index = 1;
        while (true) {
            int cur = queue.poll() - index;
            if (cur <= 0) {
                queue.offer(0);
                break;
            } else {
                queue.offer(cur);
            }
            index = (index % 5) + 1;
        }
    }
}
