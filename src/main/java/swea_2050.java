import java.util.Scanner;

public class swea_2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]-64 + " ");
        }
    }
}
