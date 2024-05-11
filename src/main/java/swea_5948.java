import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class swea_5948 {
    static int[] arr = new int[7];
    static HashSet<Integer> sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt(); // arr[] = [ 1 2 3 4 5 6 7 ]
            }
            sum = new HashSet<>();
            //7개중 3개를 뽑아서 5번째로 큰 수를 출력해야 함
            //3개의 합 중 중복된 값을 제거해야 하므로 합을 HashSet에 저장하자
            //백트래킹을 이용해 3개 합치는 경우를 구하자
            total_sum(0, 0, 0);
            //sum HashSet에 합들이 순서없이 저장되어 있다.
            //sum HashSet을 배열로 전환 후 Array.sort()로 오름차순으로 정렬
            Object[] newArray = sum.toArray();
            Arrays.sort(newArray);
            System.out.println("#" + test_case + " " + newArray[sum.size() - 5]);
        }
    }

    private static void total_sum(int idx, int cnt, int total) {
        if (idx == arr.length) { //arr.length == 7
            if (cnt == 3)
                sum.add(total);
            return;
        }
        total_sum(idx + 1, cnt + 1, total + arr[idx]);
        total_sum(idx + 1, cnt, total);
    }
}
