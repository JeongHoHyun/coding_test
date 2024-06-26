package coding_test._01string;

import java.util.Scanner;

class Main5{
    public String solution(String str){
        String answer;
        // str을 char 배열로 변경후 c 에 저장
        char[] c = str.toCharArray();
        // 왼쪽 끝과 오른쪽 끝의 index 저장
        int lt = 0, rt = str.length()-1;
        while(lt < rt){
            // 왼쪽 끝이 알파벳이 아니면 그냥증가
            if (!Character.isAlphabetic(c[lt])){
                lt++;
                // 오른쪽 끝이 알파벳이 아니면 그냥 감소
            } else if (!Character.isAlphabetic(c[rt])){
                rt--;
            } else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

}
public class String_5 {
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
