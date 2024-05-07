import java.util.Scanner;

public class swea_1215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            char[][] board = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String str = sc.next();
                for (int j = 0; j < 8; j++) {
                    board[i][j] =str.toCharArray()[j];
                }
            }
        }
    }
}
