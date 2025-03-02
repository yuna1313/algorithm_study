import java.util.ArrayList;
import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    public static int[] solution(int[] answers) {
        // 수포자들 답안 패턴
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 수포자들 정답 저장 배열
        int[] scores = new int[3];

        // i: 정답 배열 반복문 / j: 수포자 정답 배열 반복문, j가 수포자들의 index라고 생각하면 됨
        for(int i=0 ; i<answers.length ; i++) {
            for(int j=0 ; j<pattern.length ; j++) {
                // 해당 수포자(j)의 답안 패턴 길이를 정답 배열 값(i)와 연산함으로써 답안을 확인한다.
                // 정답인 경우 해당 수포자(j)의 정답 저장 배열에 +1을 해준다.
                if(answers[i] == pattern[j][i%pattern[j].length]) {
                    scores[j]++;
                }
            }
        }

        // 가장 높은 점수 저장
        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> list = new ArrayList<>();

        // 가장 높은 점수와 일치한다면, 해당 수포자(i) 값 추가
        for(int i=0 ; i<scores.length ; i++) {
            if(scores[i] == maxScore) {
                list.add(i+1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

}