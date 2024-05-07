import java.util.Scanner;

public class swea_1289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.next();
            int N = str.length();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = str.charAt(i) - '0';
            }
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    if (arr[i] == 0) {
                        continue;
                    } else {
                        cnt++;
                    }
                } else if (arr[i] == 1 && arr[i - 1] == 0) {
                    cnt++;
                } else if (arr[i] == 0 && arr[i - 1] == 1) {
                    cnt++;
                }
            }
            System.out.println("#"+test_case+" "+cnt);
        }
    }
}
