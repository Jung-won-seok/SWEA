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
            //max값 찾아 -> 0번째 인덱스와 교환 -> 1번째 인덱스부터 max값 찾아 -> 1번 인덱스와 교환
            if (switch_cnt > 10 || switch_cnt < 1) {
                System.out.println("잘못된 입력입니다.");
                System.exit(0);
            }

            //start_num을 배열에 숫자 하나씩 저장
            String numStr = Integer.toString(start_num);
            int[] arr = new int[numStr.length()];
            for (int i = 0; i < numStr.length(); i++) {
                arr[i] = numStr.charAt(i) - '0'; //9 4
            }


            for (int i = 0; i < switch_cnt; i++) {
                int max = 0;
                int max_index = 0;
                for (int j = i; j < numStr.length() ; j++) {
                    if (max < arr[j]) {
                        max = arr[j];
                        max_index = j;
                    }
                }
                if (max_index != i) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[max_index];
                    arr[max_index] = arr[i]; //맨 앞의 인덱스와 최댓값 교환
                } else if (max_index == i) { // [ 9 2 3 8 5 ]
                    if (numStr.length() == 2) {
                        int temp = 0;
                        temp = arr[i];
                        arr[i] = arr[max_index];
                        arr[max_index] = arr[i];
                    } else {
                        switch_cnt++;
                        continue; //[ 9 7 5 2 1 ] [ 9 7 2 5 1 ] 1. 최대값인데 억지로 바꿔야 하는 경우
                    }                                        // 2. 바꾸지 말고 다음으로 넘어가야 하는 경우
                }
            }


        }
    }
}