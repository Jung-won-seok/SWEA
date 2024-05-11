import java.sql.SQLOutput;
import java.util.Scanner;

public class swea_3131 {
    public static void main(String[] args) {
        int n = 1000000;
        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) { // i=2, 4, 8
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {// j=4~100, 16~100, 64~100
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
