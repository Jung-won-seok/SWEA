import java.util.Scanner;

public class swea_4406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String input = sc.next();
            char[] arr = input.toCharArray(); //arr[] = [ c, o, n, g, r, a, t, u, l, a, t, i, o, n ]
            int size = input.length();
            for (int i = 0; i < size; i++) {
                if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                    arr[i] = 0;
                }
            }
            System.out.print("#"+test_case+" ");
            for (int i = 0; i < size; i++) {
                if(arr[i] != 0)
                    System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
