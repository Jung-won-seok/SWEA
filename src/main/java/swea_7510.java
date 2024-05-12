import java.util.Scanner;

public class swea_7510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // N=15 -> [15] = [7 + 8] = [4 + 5 + 6] = [1 + 2 + 3 + 4 + 5]
            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                int sum = 0;
                for (int j = i; j <= N; j++) { //1~15
                    sum = sum + j;
                    if (sum == N) {
                        cnt++;
                        break;
                    } else if (sum > N) {
                        break;
                    }
                }
            }
            System.out.println("#"+test_case+" "+cnt);
        }
    }
}
