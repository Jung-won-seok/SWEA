import java.util.Scanner;

public class swea_2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }
        if (N < 9 || N > 199) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        mergesort(arr);
        System.out.println(arr[N/2]);
    }

    private static void mergesort(int[] A) { // 배열을 내림차순으로 정렬
        int size = A.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (A[i] > A[j]) {
                    continue;
                } else if (A[i] < A[j]) {
                    int temp = 0;
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

}
