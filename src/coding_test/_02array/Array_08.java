package coding_test._02array;

import java.util.ArrayList;
import java.util.Scanner;

class Main8{
    public int[] solution(int[] iArr){
        int[] answer = new int[iArr.length];
        for(int i = 0; i<iArr.length; i++){
                int count = 1;
            for(int j = 0; j<iArr.length; j++){
                if (iArr[j] > iArr[i]){
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
public class Array_08 {

    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] iArr = new int[n];
        for (int i = 0; i<n; i++){
            iArr[i] = sc.nextInt();
        }
        for (int i : T.solution(iArr)){
            System.out.print(i + " ");
        }
    }
}
