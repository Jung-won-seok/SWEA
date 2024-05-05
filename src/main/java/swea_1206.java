import java.util.Scanner;

public class swea_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = sc.nextInt(); //건물의 개수
            sc.nextLine();
            int[] hight = new int[N];
            int result = 0;
            for (int i = 0; i < N; i++) {
                hight[i] = sc.nextInt();
            } // 0 0 254 185 76 227 84 175 0 0
            for (int j = 2; j < N - 2; j++) { //2 3 4 5 6 7
                if (hight[j] > hight[j - 1] && hight[j] > hight[j - 2] && hight[j] > hight[j + 1] && hight[j] > hight[j + 2]) {

                    int max = 0;
                    for (int p = 1; p <= 2; p++) {
                        if (max < hight[j - p]) {
                            max = hight[j - p];
                        }
                        if (max < hight[j + p]) {
                            max = hight[j + p];
                        }
                    }
                    result += (hight[j] - max);

                } else {
                    continue;
                }
            }
            System.out.println("#" + test_case + " " + result);
        }
    }
}
