import java.util.Scanner;

public class swea_16910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int count = 0;
            for (int i = -N; i <= N; i++) {
                for (int j = -N; j <= N; j++) {
                    if (i * i + j * j <= N * N) {
                        count++;
                    }
                }
            }
            System.out.println("#" + test_case + " " + count);
        }
    }
}
