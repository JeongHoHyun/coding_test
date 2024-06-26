package coding_test._02array;

import java.util.ArrayList;
import java.util.Scanner;

class Main2{
    public int solution(int[] arr) {
        int answer = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if (max < arr[i]){
               answer++;
               max = arr[i];
           }
        }
        return answer;
    }
}

public class Array_02 {
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
