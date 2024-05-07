import java.util.Scanner;

public class swea_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] board = new int[100][100];
            int[] sum = new int[201];
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            //가로의 합 sum[0]~sum[99]까지 대입
            for (int i = 0; i < 100; i++) { // i=0
                int rowSum = 0;
                for (int j = 0; j < 100; j++) {
                    rowSum += board[i][j];
                }
                sum[i] = rowSum;
            }

            //세로의 합 sum[100]~sum[199]까지 대입
            for (int i = 0; i < 100; i++) {
                int colSum = 0;
                for (int j = 0; j < 100; j++) {
                    colSum += board[j][i];
                }
                sum[i + 100] = colSum;
            }

            //대각선의 합 sum[200]에 대입
            int diagonalSum = 0;
            for (int i = 0; i < 100; i++) {
                diagonalSum += board[i][i];
            }
            sum[200] = diagonalSum;

            int max = 0;
            for (int i = 0; i < sum.length; i++) {
                if (max < sum[i]) {
                    max = sum[i];
                }
            }

            System.out.println("#"+N+" "+max);
        }
    }
}
