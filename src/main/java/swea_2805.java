import java.util.Scanner;

public class swea_2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // N = 5
            if (N % 2 == 0) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }
            int[][] farm = new int[N][N];

            for (int i = 0; i < N; i++) {
                String input = sc.next();
                for (int j = 0; j < N; j++) {
                    farm[i][j] = input.charAt(j) - '0';
                }
            }

            int sum = 0;
            for (int p = 0; p < N; p++) { //N=5 , (N-1)/2 = 2
                if (p <= (N - 1) / 2) { //p<=2 (0~2)
                    for (int q = ((N - 1) / 2) - p; q <= ((N - 1) / 2) + p; q++) { //p=1 -> 1~3 | p=2 -> 0~4
                        sum = sum + farm[p][q];
                    }
                } else if (p > (N - 1) / 2) { //3~4
                    for (int q = ((N - 1) / 2) - (p - ((N - 1) / 2)); q <= ((N - 1) / 2) + (p - ((N - 1) / 2)); q++) {
                        sum = sum + farm[p][q];
                    }
                }//1-1=0

            }
            System.out.println("#"+test_case+" "+sum);
        }
    }
}
