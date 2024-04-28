import java.util.Scanner;

public class swea_2072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < T; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] % 2 != 0) {
                    sum += arr[j];
                }
            }
            System.out.println("#"+(i+1)+" "+sum);
        }
    }
}
