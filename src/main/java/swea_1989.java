import java.util.Scanner;

public class swea_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();

            if (arr.length % 2 == 0) { //짝수일 때 -> 10이면 0과9,
                int start = 0;
                int end = arr.length - 1;
                boolean check = false;
                while (start < end) {
                    if (arr[start] != arr[end]) {
                        System.out.println("#"+test_case+" "+0);
                        check = true;
                        break;
                    }
                    start++;
                    end--;
                }
                if (check == false) {
                    System.out.println("#"+test_case+" "+1);
                }
            }
            else if (arr.length % 2 != 0) { //홀수일 때 -> 9면 0 1 2 3 4 5 6 7 8
                int start = 0;
                int end = arr.length - 1;
                boolean check = false;
                while (start < end) {
                    if (arr[start] != arr[end]) {
                        System.out.println("#"+test_case+" "+0);
                        check = true;
                        break;
                    }
                    start++;
                    end--;
                }
                if (check == false) {
                    System.out.println("#"+test_case+" "+1);
                }
            }
        }
    }
}
