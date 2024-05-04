import java.util.Scanner;

public class swea_1979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); //퍼즐의 가로 세로 길이 -> 5
            int K = sc.nextInt(); // 단어의 길이 -> 3
            int[][] puzzle = new int[N][N];
            //퍼즐 값 입력
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    puzzle[i][j] = sc.nextInt();
                }
            }
            sc.nextLine();
            //퍼즐이 1,0 이 아닐 때 잘못된 값
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    if (puzzle[i][j] != 1 || puzzle[i][j] != 0) {
//                        System.out.println("잘못된 입력입니다.");
//                        System.exit(0);
//                    }
//                }
//            }

            int cnt = 0;
            int result = 0;
            //가로 검사
            for (int p = 0; p < N; p++) {
                for (int q = 0; q < N; q++) {
                    if (puzzle[p][q] == 1) { // 1 1 0 1 1
                        cnt++;
                    } else if (puzzle[p][q] == 0) {
                        if (cnt == K) {
                            result++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == K) {
                    result++;
                }
                cnt = 0;
            }
            //세로 검사
            for (int p = 0; p < N; p++) {
                for (int q = 0; q < N; q++) {
                    if (puzzle[q][p] == 1) { // 1 1 0 1 1
                        cnt++;
                    } else if (puzzle[q][p] == 0) {
                        if (cnt == K) {
                            result++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == K) {
                    result++;
                }
                cnt = 0;
            }
            System.out.println("#"+test_case+" "+result);
        }
    }
}
