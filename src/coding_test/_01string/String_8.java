package coding_test._01string;

import java.util.Scanner;

class Main8{
    public String solution1(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }
    public String solution2(String str){
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        int len = str.length();
        for (int i=0; i<len/2; i++){
            if (str.charAt(i) != str.charAt(len -i -1)){
                answer = "NO";
                break;
            }
        }
        return answer;
    }
}
public class String_8 {
    public static void main(String[] args) {
        // 펠린드롬에서 특수문자, 공백등 나머지는 다 제외하고 대소문자 구별하지 않음
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution1(str));
        System.out.println(T.solution2(str));
    }

}
