import java.util.Scanner;

public class swea_1220 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = 10;
        StringBuffer sb = new StringBuffer();
        int result;
        for (int test_case = 1; test_case <= T; test_case++) {

            result = 0; //교착 개수
            int n = sc.nextInt(); //100받기
            int[][] arr = new int[n][n];

            // 1 빨강: N극 자성체, 2: 파랑 S극 자성체
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<n;i++){
                int red = 0;
                int blue =0;
                for(int j=0;j<n;j++){
                    if(arr[j][i] ==1){
                        red =1;
                        blue = 0;
                    }else if(arr[j][i] ==2){
                        blue =1;
                    }else{ }//0인경우

                    if(blue == 1 && red ==1) {result++; blue = red = 0;} //교착개수 증가
                }
            }

            sb.append("#").append(test_case).append(" ").append(result).append("\n");
        }

        System.out.println(sb);
    }

}
