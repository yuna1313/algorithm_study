import java.util.Arrays;

public class MatrixMulti01 {

    public static void main(String[] args) {
        // 첫 번째 2차원 배열
        int[][] arr1 = {
                {1, 4},
                {3, 2},
                {4, 1}
        };
        // 두 번째 2차원 배열
        int[][] arr2 = {
                {3, 3},
                {3, 3}
        };
        // 세 번째 2차원 배열
        int[][] arr3 = {
                {2, 3, 2},
                {4, 2, 4},
                {3, 1, 4}
        };
        // 네 번째 2차원 배열
        int[][] arr4 = {
                {5, 4, 3},
                {2, 4, 1},
                {3, 1, 1}
        };
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
        System.out.println(Arrays.deepToString(solution(arr3, arr4)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int r1 = arr1.length;
        int c1 = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        int[][] answer = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
