import java.util.Scanner;

public class swea_1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int start_num = sc.nextInt(); // 32888
            int switch_cnt = sc.nextInt(); // 2
//            if (start_num > 6 || start_num < 1) { //32888을 배열에 넣어 -> [ 3 2 8 8 8 ]
//                System.out.println("잘못된 입력입니다.");
//                System.exit(0);
//            }
            if (switch_cnt > 10 || switch_cnt < 1) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }

            //start_num을 배열에 숫자 하나씩 저장
            String numStr = Integer.toString(start_num);
            int[] arr = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                arr[i] = numStr.charAt(i) - '0';
            }
            //내림차순 정렬 -> switch_num 번 만큼 앞의 수 이동
            int max = 0;
            for (int j = 0; j < numStr.length(); j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }

        }
    }
}
