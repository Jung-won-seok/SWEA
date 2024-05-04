import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class swea_1983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {

            int N = sc.nextInt(); // 학생 수 -> 10
            int K = sc.nextInt(); // 알고싶은 학생 번호 -> 2
            double[] student_grade = new double[N];
            for (int i = 0; i < N; i++) {
                int middle = sc.nextInt();
                int finals = sc.nextInt();
                int homework = sc.nextInt();
                double total_score = (0.35 * middle) + (0.45 * finals) + (0.2 * homework);
                student_grade[i] = total_score;
            }
            Arrays.sort(student_grade); //등수로 정렬

            for (double a : student_grade) {
                System.out.println(a);
            }

        }
    }
}
