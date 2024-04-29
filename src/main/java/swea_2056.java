import java.util.Scanner;

public class swea_2056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[8];

        for (int i = 1; i <= T; i++) {
            String input = sc.nextLine();
            for (int j = 0; j < 8; j++) {
                arr[j] = input.charAt(j) - '0';
            }
            int year = (arr[0] * 1000) + (arr[1] * 100) + (arr[2] * 10) + arr[3];
            int month = (arr[4] * 10) + arr[5];
            int day = (arr[6] * 10) + arr[7];
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day <= 31) {
                    System.out.println("#" + i + " " + arr[0] + arr[1] + arr[2] + arr[3] + "/" + arr[4] + arr[5] + "/" + arr[6] + arr[7]);
                } else {
                    System.out.println("#"+i+" "+"-1");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 30) {
                    System.out.println("#" + i + " " + arr[0] + arr[1] + arr[2] + arr[3] + "/" + arr[4] + arr[5] + "/" + arr[6] + arr[7]);
                } else {
                    System.out.println("#" + i + " " + "-1");
                }
            } else if (month == 2) {
                if (day >= 1 && day <= 28) {
                    System.out.println("#" + i + " " + arr[0] + arr[1] + arr[2] + arr[3] + "/" + arr[4] + arr[5] + "/" + arr[6] + arr[7]);
                } else {
                    System.out.println("#" + i + " " + "-1");
                }
            } else {
                System.out.println("#" + i + " " + "-1");
            }
        }


    }
}
