package coding_test.string;

import java.util.Scanner;

class Main7{
    public String bestSolution(String str){
        String answer = "YES";
        int len = str.length();
        for (int i=0; i < len/2; i ++){
            if (str.toUpperCase().charAt(i) != str.toUpperCase().charAt(len-i-1)){
                return "NO";
            }
        }
        return answer;
    }
    public String solution1(String str){
        String answer = "";
        char[] c = str.toUpperCase().toCharArray();
        int lt = 0;
        int rt = c.length-1;
        while(lt <= rt){
            if (c[lt] == c[rt]){
                lt++;
                rt--;
                answer = "YES";
            } else {
                answer = "NO";
                break;
            }
        }
        return answer;
    }public String solution2(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).toString();
        if (str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return answer;
    }
}
public class String_7 {
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution1(str));
        System.out.println("----------------");
        System.out.println(T.solution2(str));
        System.out.println("---------------");
        System.out.println(T.bestSolution(str));
    }
}
