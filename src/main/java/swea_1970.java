import java.util.Scanner;

public class swea_1970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int a = N / 50000;
            int b = (N - (50000 * a)) / 10000;
            int c = (N - (50000 * a) - (10000 * b)) / 5000;
            int d = (N - (50000 * a) - (10000 * b) - (5000 * c)) / 1000;
            int e = (N - (50000 * a) - (10000 * b) - (5000 * c) - (1000 * d)) / 500;
            int f = (N - (50000 * a) - (10000 * b) - (5000 * c) - (1000 * d) - (500 * e)) / 100;
            int g = (N - (50000 * a) - (10000 * b) - (5000 * c) - (1000 * d) - (500 * e) - (100 * f)) / 50;
            int h = (N - (50000 * a) - (10000 * b) - (5000 * c) - (1000 * d) - (500 * e) - (100 * f) - (50 * g)) / 10;
            System.out.println("#"+test_case);
            System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
        }
    }
}
