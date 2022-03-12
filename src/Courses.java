public class Courses {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Boolean flag = true;
        for (int i = 0; i < participant.length; i++) {

            for (int c = 0; c < completion.length; c++) {

                if (participant[i].equals(completion[c])) {
                    continue;
                }


            }

        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        Courses courses = new Courses();

        String answer = courses.solution(participant, completion);
        System.out.println(answer);

    }


}
