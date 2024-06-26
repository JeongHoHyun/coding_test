package coding_test._01string;

import java.util.ArrayList;
import java.util.Scanner;

class Main6{
    public String bestSolution(String str){
        String answer = "";
        for (int i=0; i < str.length(); i++){
            // indexOf는 해당 글자가 처음 등장하는 index값을 찍어준다.
            // i와 str의 i번째의 indexOf 값이 같으면 그 글짜는 i번째에 처음 등장하는 것이다.
            // 그러나 i와 indexOf의 값이 다르다면 해당 글자는 i번째 이전에 등장한 적이 있으므로 중복된 값이다.
            if (str.indexOf(str.charAt(i)) == i){
                // 중복되지 않는 값들만 answer에 넣어준다.
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public String solution(String str){
        String answer = "";
        char[] c = str.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        for (char x : c){
            charList.add(x);
        }
        for (int i = 0; i < charList.size(); i++){
            for (int j = 0; j < charList.size(); j++){
                if (i != j && charList.get(i) == charList.get(j)){
                    charList.remove(j);
                    j--;
                }
            }
            answer += charList.get(i);
        }
        return answer;
    }

}

public class String_6 {
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
        System.out.println("------------------");
        System.out.println(T.bestSolution(str));
    }
}
