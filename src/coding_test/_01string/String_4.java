package coding_test._01string;

import java.util.ArrayList;
import java.util.Scanner;

class Main4{
    public ArrayList<String> bestSolutioin(String[] str){
        ArrayList<String> result = new ArrayList();
        for (String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            result.add(tmp);
        }
        return result;
    }
    public ArrayList<String> solution1(String[] s){
        ArrayList<String> result = new ArrayList<>();
        String revers = "";
        for (String x : s){
            for (int j = 1; j <= x.length(); j ++){
                revers += String.valueOf(x.charAt(x.length()-j));
            }
            result.add(revers);
            revers = "";
        }
        return result;
    }
    public ArrayList<String> solution2(String[] s){
        ArrayList<String> result = new ArrayList<>();
        for (String x : s){
            char[] c = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            result.add(tmp);
        }
        return result;
    }
}

public class String_4 {
    public static void main(String[] args) {
        //N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int count = 0;
        for (int i=0; i < n; i++) {
            s[i] = sc.next();
        }
        for (String x : T.solution1(s)) {
            System.out.println(x);
        }
        System.out.println("------------------");
        for (String x : T.bestSolutioin(s)) {
            System.out.println(x);
        }
        System.out.println("------------------");
        for (String x : T.solution2(s)) {
            System.out.println(x);
        }
    }
}
