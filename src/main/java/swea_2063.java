import java.util.Scanner;

public class swea_2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }
        if (N < 9 || N > 199) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr[N/2]);
    }
}
