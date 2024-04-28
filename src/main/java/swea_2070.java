import java.util.Scanner;

public class swea_2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[2];
        for (int i = 1; i <= T; i++) {
            for (int j = 0; j < 2; j++) {
                arr[j] = sc.nextInt();
            }
            if (arr[0] < arr[1]) {
                System.out.println("#"+i+" "+"<");
            } else if (arr[0] == arr[1]) {
                System.out.println("#" + i + " " + "=");
            } else {
                System.out.println("#" + i + " " + ">");
            }
        }
    }
}
