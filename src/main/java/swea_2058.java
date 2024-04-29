import java.util.Scanner;

public class swea_2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N = 6789
        if (N < 1 || N > 9999) { // 1 <= N <= 9999
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }
        int a = N / 1000;
        int b = (N%1000) / 100;
        int c = (N % 100) / 10;
        int d = N %10;
        System.out.println(a+b+c+d);
    }
}
