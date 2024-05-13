import java.util.Scanner;

public class swea_14178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // 5
            int D = sc.nextInt(); // 3 -> 출력 2
            int result = 0;
            int round = 2 * D + 1;
            if (N % round != 0) {
                result = N / round + 1;
            } else if (N % round == 0) {
                result = N / round;
            }
            System.out.println("#" + test_case + " " + result);
        }
    }
}
