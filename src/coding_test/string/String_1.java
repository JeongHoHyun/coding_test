package coding_test.string;

import java.util.Scanner;

class Main1{
    // 입력받아 갯수를 반환시켜주는 메소드
    public int solution(String str, char c){
        int count = 0;
        // 대소문자 구분이 없기 때문에 전부다 대문자로변환.
        str = str.toUpperCase();
        // char타입의 경우 아래와 같은 방식으로 대문자 변환.
        c = Character.toUpperCase(c);
        /*for (int i = 0; i < str.length(); i++) {
            //str의 길이만큼 순회하여 str의 i번째 글자(char)가 c와 같으면 카운트를 증가.
            if (str.charAt(i) == c){
                count++;
            }
        }*/
        for (char x : str.toCharArray()) {
            if (x == c){
                count++;
            }
            //count = x == c ? ++count : count;
        }
        return count;
    }
}

public class String_1 {
    public static void main(String[] args) {
        // 한 개의 문자열을 입력 받고, 특정 문자를 입력받아
        // 해당 특정 문자가 입력 받은 문자열에 몇개 존재하는지 알아내는 프로그램을 작성하세요
        // 대소문자를 구분하지 않습니다.
        Main1 T = new Main1();
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        char char1 = in.next().charAt(0);
        System.out.println(T.solution(str1, char1));
    }
}
