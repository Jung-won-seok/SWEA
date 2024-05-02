import java.util.Scanner;

public class swea_1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //10
        if (N < 10 || N > 1000) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }
        for (int i = 1; i <= N; i++) { // 1~10
            String str = Integer.toString(i);
            char[] arr = str.toCharArray();
            int cnt = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '3' || arr[j] == '6' || arr[j] == '9') {
                    cnt++;
                }
            }
                    if (cnt == 0) {
                        System.out.print(i+" ");
                    } else if (cnt == 1) {
                        System.out.print("-"+" ");
                    } else if (cnt == 2) {
                        System.out.print("--"+" ");
                    } else {
                        System.out.print("---"+" ");
                    }

        }
    }
}
