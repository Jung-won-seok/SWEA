import java.util.Scanner;

public class swea_1976 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            if (h1 < 1 || h1 > 12 || h2 < 1 || h2 > 12) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }
            if (m1 < 0 || m1 > 59 || m2 < 0 || m2 > 59) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }
            int h_sum = 0;
            int m_sum = 0;
            h_sum = h1 + h2;
            m_sum = m1 + m2;
            if (m_sum > 59) {
                h_sum += 1;
                m_sum -= 60;
            }
            if (h_sum > 12) {
                h_sum -= 12;
            }
            System.out.println("#"+i+" "+h_sum+" "+m_sum);
        }
    }
}
