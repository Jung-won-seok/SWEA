import java.util.Scanner;

public class swea_1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {

            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int min = arr[0];
            int max_index = 0;
            int min_index = 0;
            for (int j = 1; j < 10; j++) { //최대값 구하기
                if (max < arr[j]) {
                    max = arr[j];
                    max_index = j;
                }
            }
            for (int k = 1; k < 10; k++) { // 최소값 구하기
                if (min > arr[k]) {
                    min = arr[k];
                    min_index = k;
                }
            }

            arr[max_index] = 0;
            arr[min_index] = 0;
            int sum = 0;
            for (int p = 0; p < 10; p++) {
                sum += arr[p];
            }
            double avg = sum / 8.0;
            int result = (int)Math.round(avg);
            System.out.println("#"+test_case+" "+result);
        }
    }
}
