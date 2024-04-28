import java.util.Scanner;

public class swea_2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[10];
        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            for (int j = 0; j < 10; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}
