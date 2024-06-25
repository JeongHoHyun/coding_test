package coding_test.string;

import java.util.Scanner;

class Main9{
    public int solution(String str){
        int answer = 0;
        answer = Integer.parseInt(str.replaceAll("[^0-9]", ""));
        return answer;
    }
    public int solution2(String str){
        int answer = 0;
        for (char x : str.toCharArray()){
            // 아스키 코드를 이용하는 방식.
            // 48은 0 이고 57은 9
            if (x >= 48 && x <= 57){
                // 마지막에 x - 48을 하는이유는 x 는 char 형이기 때문에 그냥 더하면 48을 더해버리기 때문이다. * 10을 하는이유는 자리수 때문
                answer = answer * 10 + (x - 48);
            }
        }
        return answer;
    }
    public int solution3(String str){
        String answer = "";
        for (char x : str.toCharArray()){
            // 만약 char형의 x가 숫자인지 확인 하는 메서드
            if (Character.isDigit(x)){
                answer += x;
            }
        }
        // 이런식으로 리턴해주지 않으면 맨앞에 0이 오는경우 그대로 0까지 넘어가기 때문에 int형으로 변환
        return Integer.parseInt(answer);
    }
}
public class String_9 {
    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));
        System.out.println(T.solution3(str));
    }
}
