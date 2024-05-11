import java.util.Scanner;

public class swea_5431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // N=5
            int K = sc.nextInt(); // K=3 -> 5명중 3명 제출
            int[] student = new int[N];
            int[] submit = new int[K];
            for (int i = 0; i < N; i++) {
                student[i] = i+1; //student[] = [ 1 2 3 4 5 ]
            }
            for (int i = 0; i < K; i++) {
                submit[i] = sc.nextInt(); //submit[] = [ 2 5 3 ]
            }
            //제출 안 한 학생번호 출력
            for (int i = 0; i < K; i++) {
                student[submit[i] - 1] = 0;
            }
            System.out.print("#"+test_case+" ");
            for (int i = 0; i < N; i++) {
                if (student[i] != 0) {
                    System.out.print(student[i]+" ");
                }
            }
        }
    }
}
