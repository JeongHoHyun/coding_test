package coding_test._02array;

import java.util.ArrayList;
import java.util.Scanner;

class Main3{
    public String solution2(int[] aArr, int[] bArr){
        String answer = "";
        for (int i = 0; i < aArr.length; i++) {
            if (aArr[i] == bArr[i]){
                answer += "D";
            } else if (aArr[i] == 1 && bArr[i] == 3) {
                answer += "A";
            } else if (aArr[i] == 2 && bArr[i] == 1) {
                answer += "A";
            } else if (aArr[i] == 3 && bArr[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }
    public ArrayList<String> solution(int[] aArr, int[] bArr){
        ArrayList<String> answer = new ArrayList<>();
        // 1:가위, 2:바위, 3:보
        for (int i = 0; i<aArr.length; i++){
            if (aArr[i] == 1){
                if (bArr[i] == 1){
                    answer.add("D");
                } else if (bArr[i] == 2){
                    answer.add("B");
                } else if (bArr[i] == 3) {
                    answer.add("A");
                }
            } else if(aArr[i] == 2){
                if (bArr[i] == 1){
                    answer.add("A");
                } else if (bArr[i] == 2){
                    answer.add("D");
                } else if (bArr[i] == 3) {
                    answer.add("B");
                }
            } else if (aArr[i] == 3) {
                if (bArr[i] == 1){
                    answer.add("B");
                } else if (bArr[i] == 2){
                    answer.add("A");
                } else if (bArr[i] == 3) {
                    answer.add("D");
                }
            }
        }
        return answer;
    }
}

public class Array_03 {
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }
        for (String s : T.solution(aArr, bArr)) {
            System.out.println(s);
        }
        System.out.println("-----------------");
        for (char x : T.solution2(aArr, bArr).toCharArray()){
            System.out.println(x);
        }
    }
}
