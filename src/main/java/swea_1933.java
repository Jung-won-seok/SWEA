import java.util.Scanner;

public class swea_1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 1 || N > 1000) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
