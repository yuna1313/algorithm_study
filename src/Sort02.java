import java.util.Arrays;
import java.util.Collections;

public class Sort02 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 2, 1, 3,4})));
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 1, 3, 2, 5, 4})));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[] solution(int[] arr) {
        // 중복값 제거
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        // 내림차순 정렬
        Arrays.sort(result, Collections.reverseOrder());
        // Integer -> int 형으로 변환하여 return
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

}