import java.util.Scanner;

public class swea_2806 {
    static int ans = 0;
    static int[] chess;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            ans = 0;
            N = sc.nextInt();
            chess = new int[N];
            dfs(0);
            System.out.println("#" + test_case + " " + ans);
        }
    }

    private static void dfs(int depth) {
        if (depth == N) {
            ans++;
            return;
        }
        for (int i = 0; i < N; i++) {
            chess[depth] = i; //chess[0] = 0
            if (isPossible(depth)) { //depth == 0
                dfs(depth + 1);
            }
        }
    }

    private static boolean isPossible(int depth) {
        for (int i = 0; i < depth; i++) {
            if (chess[i] == chess[depth] || depth - i == Math.abs(chess[depth] - chess[i])) {
                return false;
            }
        }
        return true;
    }
}
