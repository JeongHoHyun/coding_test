package coding_test._02array;

import java.util.ArrayList;
import java.util.Scanner;

class Main5{
    public int solution(int n){
        // 에라토스테네스의 체 (2중 포문은 수가 커지면 시간이 오래걸림)
        int answer = 0;
        int[] iArr = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (iArr[i] == 0) {
                answer ++;
                // i = 2 일 때, j = 2 부터 20까지 증가 2+2=4, 4+2=6, 6+2=8 ... 20까지 i의 배수로 증가 시켜 체크
                for (int j = i; j <= n; j = j + i) {
                    iArr[j] = 1;
                }
            }
        }
        return answer;
    }
}

public class Array_05 {
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
