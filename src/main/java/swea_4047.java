import java.util.Scanner;

public class swea_4047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String input = sc.next(); // S01 D02 H03 H04
            int[] S_num = new int[13];
            int[] D_num = new int[13];
            int[] H_num = new int[13];
            int[] C_num = new int[13];
            for (int i = 0; i < 13; i++) {
                S_num[i] = 0;
            }
            for (int i = 0; i < 13; i++) {
                D_num[i] = 0;
            }
            for (int i = 0; i < 13; i++) {
                H_num[i] = 0;
            }
            for (int i = 0; i < 13; i++) {
                C_num[i] = 0;
            }
            // [S->13장], [D->13장], [H->13장], [C->13장]
            char[] arr = input.toCharArray();
            for (int i = 0; i < arr.length; i += 3) {
                if (arr[i] == 'S') {
                    String str1 = Character.toString(arr[i + 1]); // str1 = "0"
                    String str2 = Character.toString(arr[i + 2]); // str2 = "1"
                    String munza = str1 + str2; // "01"
                    int number = Integer.parseInt(munza); // number == 1
                    S_num[number]++; // 1의 개수 = 나온 카드
                }
                if (arr[i] == 'D') {
                    String str1 = Character.toString(arr[i + 1]); // str1 = "0"
                    String str2 = Character.toString(arr[i + 2]); // str2 = "1"
                    String munza = str1 + str2; // "01"
                    int number = Integer.parseInt(munza); // number == 1
                    D_num[number]++; // 1의 개수 = 나온 카드
                }
                if (arr[i] == 'H') {
                    String str1 = Character.toString(arr[i + 1]); // str1 = "0"
                    String str2 = Character.toString(arr[i + 2]); // str2 = "1"
                    String munza = str1 + str2; // "01"
                    int number = Integer.parseInt(munza); // number == 1
                    H_num[number]++; // 1의 개수 = 나온 카드
                }
                if (arr[i] == 'C') {
                    String str1 = Character.toString(arr[i + 1]); // str1 = "0"
                    String str2 = Character.toString(arr[i + 2]); // str2 = "1"
                    String munza = str1 + str2; // "01"
                    int number = Integer.parseInt(munza); // number == 1
                    C_num[number]++; // 1의 개수 = 나온 카드
                }
            }
            int S_cnt = 0;
            int D_cnt = 0;
            int H_cnt = 0;
            int C_cnt = 0;
            boolean check = false;
            for (int j = 0; j < 13; j++) {
                if (S_num[j] == 1) {
                    S_cnt++;
                } else if (S_num[j] > 1) {
                    System.out.println("#" + test_case + " " + "ERROR");
                    check = true;

                }

                if (D_num[j] == 1) {
                    D_cnt++;
                } else if (D_num[j] > 1) {
                    System.out.println("#" + test_case + " " + "ERROR");
                    check = true;
                }

                if (H_num[j] == 1) {
                    H_cnt++;
                } else if (H_num[j] > 1) {
                    System.out.println("#" + test_case + " " + "ERROR");
                    check = true;
                }

                if (C_num[j] == 1) {
                    C_cnt++;
                } else if (C_num[j] > 1) {
                    System.out.println("#" + test_case + " " + "ERROR");
                    check = true;
                }

            }
            if (check == false) {
                System.out.println("#" + test_case + " " + (13 - S_cnt) + " " + (13 - D_cnt) + " " + (13 - H_cnt) + " "
                        + (13 - C_cnt));
            } else {
                continue;
            }

        }

    }

}
