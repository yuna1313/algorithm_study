import java.util.Arrays;
import java.util.HashSet;

public class Sum01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(solution(new int[]{5, 0, 2, 7})));
    }

    public static int[] solution(int[] numbers) {
        // 중복값 제거를 위해 HashSet 사용
        HashSet<Integer> set = new HashSet<>();

        // 모든 숫자 더하도록
        for(int i=0 ; i<numbers.length-1 ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        // 오름차순으로 정렬 후 int 배열 형태로 return
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}