import java.util.Scanner;

public class swea_2817 {
    static int N, K, countK;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt(); // N개의 자연수
            K = sc.nextInt(); // 2개 이상 선택해서 합이 K
            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            countK = 0;
            powerset(0, 0);

            System.out.println("#"+test_case+" "+countK);
        }
    }

    private static void powerset(int idx, int sum) {
        if (idx == N) {
            if (sum == K) {
                countK++;
                return;
            }
        }else {
                powerset(idx + 1, sum);
                sum += arr[idx];
                powerset(idx + 1, sum);
            }
        }
    }

