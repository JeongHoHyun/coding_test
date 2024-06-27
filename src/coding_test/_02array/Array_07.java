package coding_test._02array;

import java.util.Scanner;

class Main7{
    public int solution(int n, int[] iArr){
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++){
            if (iArr[i] == 1){
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }
}
public class Array_07 {
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] iArr = new int[n];
        for (int i = 0; i < n; i++) {
            iArr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, iArr));
    }
}
