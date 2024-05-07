import java.util.Scanner;

public class swea_1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); //N=4

            //보드 입력하여 채우기
            char[][] board = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String str = sc.next(); // CBBCBAAB
                for (int j = 0; j < 8; j++) {
                    board[i][j] =str.toCharArray()[j]; // [ C, B, B, C, B, A, A, B, ]
                }
            }

            // N 길이의 회문 찾기 -> N이 짝수일 때, N이 홀수일 때
            int cnt = 0;
            for (int i = 0; i < 8; i++) { //0~7
                for (int j = 0; j < 8 - N + 1; j++) { //0~3
                    int start = j;
                    int end = j + (N - 1);
                    int num = 0;
                    while (end > start) {
                        if (board[i][start] != board[i][end]) {
                            break;
                        }
                        start++;
                        end--;
                        num++;
                    }
                    if (num == (N / 2) || num == ((N - 1) / 2)) {
                        cnt++;
                    }

                }
            }
            System.out.println("#"+test_case+" "+cnt);
        }
    }

}
