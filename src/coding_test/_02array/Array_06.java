package coding_test._02array;

import java.util.ArrayList;
import java.util.Scanner;

class Main6{
    public ArrayList<Integer> solution(int n, int[] iArr){
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : iArr){
            int tmp = i;
            int res = 0;
            // 해당 반복문으로 뒤집은 값을 res에 넣는다.
            while (tmp > 0){
                // tmp = 123 일때 123 % 10 = 3 | 12 % 10 = 2 | 1 % 10 = 1
                int t = tmp % 10;
                // res = 3 | 3 * 10 + 2 = 32 | 32 * 10 + 1 = 321
                res = res * 10 + t;
                // tmp = 123 / 10 = 12 | 12 / 10 = 1 | 1 / 10 = 0 -> tmp = 0 이므로 반복문 탈출
                tmp = tmp / 10;
            }
            // 소수인지 확인
            if (isFrime(res)){
                answer.add(res);
            }
        }
        return answer;
    }

    private boolean isFrime(int num) {
        // 1은 소수가 아니니까 false 반환
        if (num == 1){
            return false;
        }
        for (int i = 2; i < num; i++) {
            // 자기 자신을 제외한 나머지 숫자로 나누었을때 나머지(%) 가 0 이면 나누어 떨어진다는 것이므로 소수가 아니다.
            // false 반환
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}

public class Array_06 {
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] iArr = new int[n];
        for (int i = 0; i < n; i ++){
            iArr[i] = sc.nextInt();
        }
        for (int i : T.solution(n, iArr)) {
            System.out.printf(i + " ");
        }
    }
}
