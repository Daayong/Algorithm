import java.util.Arrays;

public class Solution {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        //각각의 배열에서 원하는 수 뽑기 위한 반복문

        for (int i = 0; i < commands.length; i++) {
            int fst = commands[i][0];
            int lst = commands[i][1];
            int k = commands[i][2];

            //배열 속에서 범위 지정하여 새로운 배열 생성하기
            int[] array2 = Arrays.copyOfRange(array, fst - 1, lst);

            //배열 정렬 코드
            Arrays.sort(array2);

            answer[i] = array2[k - 1];
        }
        return answer;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = solution.solution(array, commands);

        for (int i = 0; i < answer.length; i++) {
            System.out.print("[" + answer[i] + "]");
        }

    }

}
