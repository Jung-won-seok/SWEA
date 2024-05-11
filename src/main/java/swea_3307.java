import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class swea_3307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // N = 6
            HashSet<Integer> hash = new HashSet<>();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt(); // arr[] = [ 1 3 2 5 4  ]
            }


            for (int i = 0; i < N; i++) {
                int cnt = 1;
                int a = arr[i];
                for (int j = i + 1; j < N; j++) {
                    if (a < arr[j]) {
                        a = arr[j];
                        cnt++;
                    }
                }
                hash.add(cnt);
            }
            Object[] newArray = hash.toArray();
            Arrays.sort(newArray); // [ 1 2 3 4 5 ], hash.size() = 5
            System.out.println("#" + test_case + " " + newArray[newArray.length - 1]);
        }
    }
}
