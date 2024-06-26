package coding_test._01string;

import java.util.Scanner;

class Main12{
    public String solution(String str){
        String answer = "";
        str = str.replaceAll("#" , "1").replaceAll("\\*", "0");
        int len = str.length();
        int[] iArr = new int[len/7];
        for (int i = 0; i < len/7; i++){
            iArr[i] = Integer.parseInt(str.substring(7*i, 7*i+7), 2);
        }
        for (int i=0; i<iArr.length; i++){
            answer += (char)iArr[i];
        }
        return answer;
    }
    public String solution2(int n, String s){
        String answer = "";
        for (int i = 0; i < n; i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            s = s.substring(7);
        }
        return answer;
    }
}
public class String_12 {
    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(str));
        System.out.println("-------------");
        System.out.println(T.solution2(n, str));
    }
}
