import java.util.Scanner;

public class practice_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N=3
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            String str = Integer.toString(input);
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }


        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++) {
                System.out.print(arr[a][b]);
            }
            System.out.println();
        }
    }
}
