import java.util.Scanner;

public class swea_1974 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {

            boolean check = true;
            int puzzle[][] = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    puzzle[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for (int j = 0; j < 9; j++) {
                    arr[puzzle[i][j]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            for (int i = 0; i < 9; i++) {
                int[] arr = new int[10];

                for (int j = 0; j < 9; j++) {
                    arr[puzzle[j][i]]++;
                }
                for (int k = 1; k <= 9; k++) {
                    if (arr[k] == 0) {
                        check = false;
                        break;
                    }
                }
            }

            for (int i = 0; i < 6; i += 3) {
                for (int j = 0; j < 6; j += 3) {
                    int[] arr = new int[10];



                    for (int x = i; x < i + 3; x++) {
                        for (int y = j; y < j + 3; y++) {
                            arr[puzzle[x][y]]++;
                        }
                    }
                    for (int z = 1; z <= 9; z++) {
                        if (arr[z] == 0) {
                            check = false;
                            break;
                        }
                    }
                }
            }
            int result = check ? 1 : 0;
            System.out.println("#" + test_case + " " + result);
        }
    }
}