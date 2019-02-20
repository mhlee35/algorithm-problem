import java.util.Scanner;

public class greedy_boj_1931 {
    static Scanner sc = new Scanner(System.in);
    static int N = sc.nextInt();
    static int[][] arr = new int[N][2];
    static int answer = 0;
    static int end = 0;
    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }



        // 종료시간에 따라 오름차순 sort


        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= end) {
                end = arr[i][1];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
