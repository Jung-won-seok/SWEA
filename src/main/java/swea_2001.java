import java.util.Scanner;

public class swea_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // 5
            int M = sc.nextInt(); // 2
            if (N < 5 || N > 15) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }if (M < 2 || M > N) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }
            int[][] space = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    space[i][j] = sc.nextInt();
                }
            }
            //파리채 때린 후 죽은 파리수
            int fly_num = 0;
            int cnt = 0;
            int[] arr = new int[(N - M + 1) *(N - M + 1)];
            for (int i = 0; i < N - M + 1; i++) { // 0 1 2 3
                for (int j = 0; j < N - M + 1; j++) { // 0 1 2 3

                    for (int p = i; p < i + M; p++) {
                        for (int q = j; q < j + M; q++) {
                            fly_num = fly_num + space[p][q];
                        }
                    }

                    arr[cnt] = fly_num;
                    cnt++;
                }
            }
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("#"+test_case+" "+max);

        }
    }
}
