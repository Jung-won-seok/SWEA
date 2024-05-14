import java.util.Scanner;

public class swea_4299 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int D = sc.nextInt(); // 몇일 (11 ≤ D ≤ 14) -> 14
            int H = sc.nextInt(); // 몇시간 (0 ≤ H ≤ 23) -> 23
            int M = sc.nextInt(); // 몇분 (0 ≤ M ≤ 59) -> 59 출력 ->5088
            if(D<11 || D>14) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }
            if(H<0 || H>23) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }
            if(M<0 || M>59) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }
            //분 뺄셈
            int result = 0;
            if (M >= 11) {
                result = M - 11;
            } else if (M < 11) {
                H--;
                M += 59;
                result = M - 11;
            }

            //시간 뺄셈
            if (H >= 11) {
                H = H - 11;
                H = H * 60;
                result += H;
            } else if (H < 11) {
                D--;
                H += 24;
                H = H - 11;
                H *= 60;
                result += H;
            }

            //일 뺄셈
            if (D >= 11) {
                D = D - 11;
                result += D * 60 * 24;
            }else {
                result = -1;
            }
            System.out.println("#"+test_case+" "+result);
        }
    }

}
