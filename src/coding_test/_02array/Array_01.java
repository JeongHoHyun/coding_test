package coding_test._02array;

import java.util.ArrayList;
import java.util.Scanner;

class Main1{
    public ArrayList<Integer> solution(int[] iArr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(iArr[0]);
        for (int i =1; i<iArr.length; i++){
            if (iArr[i] > iArr[i-1]){
                answer.add(iArr[i]);
            }
        }
        return answer;
    }
}

public class Array_01 {
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
