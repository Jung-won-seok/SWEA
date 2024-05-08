import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class swea_1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i = 0; i < 8; i++) {
                queue.add(sc.nextInt());
            }
        }
    }
}
