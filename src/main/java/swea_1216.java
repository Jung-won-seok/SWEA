import java.util.Scanner;

public class swea_1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        for (int test_case = 1; test_case <= T; test_case++) {
            char[][] board = new char[100][100];

            for (int i = 0; i < 100; i++) {
                String input = sc.next();
                for (int j = 0; j < 100; j++) {
                    board[i][j] = input.charAt(j);
                }
            }
            //가로 회문 최대길이 구하기
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {

                }
            }
            //세로 회문 최대길이 구하기



            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }
    }
}
