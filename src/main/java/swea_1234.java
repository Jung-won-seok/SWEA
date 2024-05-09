import java.util.LinkedList;
import java.util.Scanner;

public class swea_1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            LinkedList<Integer> list = new LinkedList<>();
            int N = sc.nextInt(); //  N=10
            //String으로 받아 int형 배열에 대입
            //배열의 값을 index[0]부터 Linkedlist에 대입
            String str = sc.next();
            int[] arr = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i) - '0';
            }
            for (int i = 0; i < N; i++) {
                list.add(arr[i]);  //list = [ 1 2 3 8 0 9 9 0 8 4 ]
            }

            //소거할 번호쌍 찾기

            int num = 0;
            while (true) {
                if (num == list.size() - 1) {
                    break;
                }
                if (list.get(num) == list.get(num + 1)) {
                    list.remove(num);
                    list.remove(num);
                    num = 0;
                } else {
                    num++;
                }
            }
            System.out.print("#"+test_case+" ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}
