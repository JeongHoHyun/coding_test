package coding_test.string;

import java.util.Scanner;

class Main10{
    public int[] solution(String str1, Character char1){
        int[] answer = new int[str1.length()];
        // 왼쪽으로부터 떨어진 거리 구하기
        int p = 100;
        for (int i = 0; i<answer.length; i++){
            if(str1.charAt(i) == char1){
                p = 0;
                answer[i] = p;
            } else {
                // 떨어진 거리를 재야하기 때문에 p를 증가시키고 넣어준다.
                answer[i] = ++p;
            }
        }
        // 오른쪽으로부터 떨어진 거리 구하기
        p = 100;
        // 오른쪽 끝에서 부터 순회해야 하기때문에 다음과 같이 for문 설정
        for (int i = str1.length()-1; i>=0; i--){
            if (str1.charAt(i) == char1){
                p = 0;
            } else {
                //Math.min(a, b) 함수를 이용하여 둘중 작은수를 배열에 담기
                // 떨어진 거리를 재야하기 때문에 p를 증가시키고 넣어준다.
                answer[i] = Math.min(answer[i], ++p);
            }
        }
        return answer;
    }
}

public class String_10 {
    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        Character char1 = sc.next().charAt(0);
        int[] answer = T.solution(str1, char1);
        for (int i : answer){
            System.out.print(i + " ");
        }
    }
}
