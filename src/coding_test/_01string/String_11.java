package coding_test._01string;

import java.util.Scanner;

class Main11{
    public String solution(String str){
        String answer = "";
        // 마지막 글자 떄문에 뒤에 공백을 추가해줌
        str = str + " ";
        int count = 1;
        for (int i=0; i<str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                count++;
            } else {
                answer += str.charAt(i);
                if (count >1){
                    answer += count;
                    count = 1;
                }
            }
        }
        return answer;
    }
}

public class String_11 {
    public static void main(String[] args) {
        Main11 T = new Main11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
