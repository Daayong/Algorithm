public class Keypad {

    public String keypad(int[] numbers, String hand) {

        String answer = "";
        String r = "r";
        String l = "l";

        //왼손일때
        int[] lHand={1,4,7};

        //오른손일때
        int[] rHand={3,6,9};

        //중간숫자들
        int[] middle={2,5,8,0};

        //마지막 손가락 위치 저장
        int lH=0; //왼손
        int rH=0; //오른손

        //무슨 손잡이 인지에 영향 받는 첫번째 numbers 에 대한 반복문
        for(int d=0; d<3;d++){
            if(numbers[0]==lHand[d]){
                answer+="L";
                lH=numbers[0];
                break;
            }else if(numbers[0]==rHand[d]){
                answer+="R";
                rH=numbers[0];
                break;
            }else{
                if(hand.equals("left")){
                    answer+="L";
                    lH=numbers[0];
                    break;
                }else{
                    answer+="R";
                    rH=numbers[0];
                    break;
                }
            }
        }

        for(int i=1; i<numbers.length; i++)
        {
            for(int s=0; s<3;s++){
                if(numbers[i]==lHand[s]){
                    answer+="L";
                    lH=numbers[i];
                }else if(numbers[i]==rHand[s]){
                    answer+="R";
                    rH=numbers[i];
                }else{
                    if(Math.abs(numbers[i]-lH)<Math.abs(numbers[i]-rH)){
                        answer+="L";
                        lH=numbers[i];
                    }else if(Math.abs(numbers[i]-rH)<Math.abs(numbers[i]-lH)){
                        answer+="R";
                        rH=numbers[i];
                    }else{
                        if(hand.equals("left")){
                            answer+="L";
                            lH=numbers[i];
                        }else{
                            answer+="R";
                            rH=numbers[i];
                        }
                    }
                }
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){

        int[] numbers={1,3,4,5,8,2,1,4,5,9,5};
        String hand="right";

        Keypad keypad = new Keypad();
        String answer=keypad.keypad(numbers,hand);

        System.out.println(answer); //답이 LRLLLRLLRRL 나와야함

    }




}
