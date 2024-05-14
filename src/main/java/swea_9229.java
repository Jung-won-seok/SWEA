import java.util.ArrayList;
import java.util.Scanner;

public class swea_9229 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            ArrayList<Integer> newArray = new ArrayList<>();
            int N = sc.nextInt(); // N=4
            int M = sc.nextInt(); // M=20
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt(); // arr[] = [ 10 5 10 16 ] -> 출력 : 20
            }
            int max = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    newArray.add(arr[i] + arr[j]); // newArray = [ 15 20 26 15 19 26 ]
                }
            }
            boolean check = false;
            for (int p = 0; p < newArray.size(); p++) {
                if (newArray.get(p) <= M) {
                    if (max < newArray.get(p)) {
                        max = newArray.get(p);
                        check = true;
                    }
                }
            }
            if (check == false) {
                max = -1;
            }
            System.out.println("#" + test_case + " " + max);

        }
    }

}
