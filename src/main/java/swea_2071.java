import java.util.Scanner;

import static java.lang.Math.*;

public class swea_2071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 1; i <= T; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = sum / 10.0;
            int roundedNum = (int) round(avg);
            System.out.println("#"+i+" "+roundedNum);
        }
    }
}
