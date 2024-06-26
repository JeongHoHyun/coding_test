package coding_test._01string;

import java.util.Scanner;

class Main2{
    public String solution(String str){
        String result = "";
      /*  for (char x : str.toCharArray()) {
            result += Character.isLowerCase(x) ? Character.toUpperCase(x) : Character.toLowerCase(x);
        }*/
        for (char x : str.toCharArray()) {
            // 소문자면 대문자로 변환, 대문자로 소문자로 변환
            if (Character.isLowerCase(x)){
                result += Character.toUpperCase(x);
            } else {
                result += Character.toLowerCase(x);
            }
            // 아스키 코드를 사용하는 방법도 있음. 대문자 : 65 ~ 90, 소문자 : 97 ~ 122
            // x가 아스키코드(소문자) 범위 안에 있으면
            if (x >= 97 && x <= 122){
                // 대문자로 변환
                result += (char) x-32;
            } else {
                // 소문자로 변환
                result += (char) x+32;
            }
        }
        return result;
    }
}

public class String_2 {
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
