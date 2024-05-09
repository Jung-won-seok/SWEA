import java.util.Scanner;

public class swea_1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            String find = sc.next(); // ti -> 2
            String sentence = sc.next(); // Starteatingwellwiththeseeighttips -> 10 [ a s d f g h q w e r ]
            //find와 sentence를 배열에 대입
            int find_size = find.length();
            char[] find_arr = new char[find_size];
            for (int i = 0; i < find_size; i++) {
                find_arr[i] = find.charAt(i);
            }
            int sentence_size = sentence.length();
            char[] sentence_arr = new char[sentence_size];
            for (int i = 0; i < sentence_size; i++) {
                sentence_arr[i] = sentence.charAt(i);
            }

            int result = 0;
            for (int i = 0; i < sentence_size - find_size + 1; i++) {
                int cnt = 0;
                for (int j = i; j < i + find_size; j++) {
                    if (sentence_arr[j] == find_arr[j - i]) {
                        cnt++;
                    }
                }
                if (cnt == find_size) {
                    result++;
                }
            }
            System.out.println("#" + N + " " + result);
        }
    }
}
