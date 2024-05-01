import java.io.*;
import java.util.StringTokenizer;

public class practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int test_case = 1; test_case <= T; test_case++) {
            int[][] sudoku = new int[10][10];
            boolean check = true;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            } //9*9스도쿠 입력

            //모든 행 검사
            for (int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for (int j = 0; j < 9; j++) {
                    arr[sudoku[i][j]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            //모든 열 검사
            for (int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for (int j = 0; j < 9; j++) {
                    arr[sudoku[j][i]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            //3*3영역 검사 (0 1 2 3 4 5 6 7 8)
            for (int i = 0; i < 9; i+=3) {
                for (int j = 0; j < 9; j += 3) {
                    int[] arr = new int[10];

                    for (int x = i; x < i+3; x++) {
                        for (int y = j; y < j + 3; y++) {

                        }
                    }
                }
            }


        }
    }
}
