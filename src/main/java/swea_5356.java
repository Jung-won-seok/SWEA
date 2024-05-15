import java.util.Scanner;

public class swea_5356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String[] input = new String[5];
            for (int i = 0; i < 5; i++) {
                input[i] = sc.next();
            }
            char[] a = input[0].toCharArray(); // a[] = A A B C D D
            char[] b = input[1].toCharArray(); // b[] = a f z z
            char[] c = input[2].toCharArray(); // c[] = 0 9 1 2 1
            char[] d = input[3].toCharArray(); // d[] = a 8 E W g 6
            char[] e = input[4].toCharArray(); // e[] = P 5 h 3 k x

            int[] size = new int[5];
            size[0] = a.length; // 6
            size[1] = b.length; // 4
            size[2] = c.length; // 5
            size[3] = d.length; // 6
            size[4] = e.length; // 6
            int max = 0;
            for (int i = 0; i < 5; i++) {
                if (max < size[i]) {
                    max = size[i];
                }
            } //max = 6
            //int max = Math.max(a.length, Math.max(b.length, Math.max(c.length, Math.max(d.length, e.length))));

            StringBuilder result = new StringBuilder();
            for(int j=0 ; j<max ; j++) {
                if(j < a.length) {
                    result.append(a[j]);
                }
                if(j < b.length) {
                    result.append(b[j]);
                }
                if(j < c.length) {
                    result.append(c[j]);
                }
                if(j < d.length) {
                    result.append(d[j]);
                }
                if(j < e.length) {
                    result.append(e[j]);
                }
            }
            System.out.println("#"+test_case+" "+result);
        }
    }
}