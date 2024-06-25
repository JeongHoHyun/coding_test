package coding_test.string;

import java.util.List;

class Main3 {
    public String solution1(String str){
        String result = "";
        List<String> list = List.of(str.split(" "));
        for (int i = 0; i < list.size(); i++) {
            if (result.length() < list.get(i).length()){
                result = list.get(i);
            }
        }
        return result;
    }
    public String solution2(String str){
        String result = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            if (x.length() > m) {
                m = x.length();
                result = x;
            }
        }
        return result;
    }
    public String solution3(String str){
        String result = "";
        int m = Integer.MIN_VALUE, pos;
        // indexOf는 () 안의 값이 나올때 그 값의 index를 반환한다
        // pos는 띄어쓰기가 나오는 index이고, 띄어쓰기가 나오지 않으면 -1 이므로 false가 되서 조건문을 타지 않는다.
        while((pos = str.indexOf(" "))!= -1){
            // tmp에 str의 처음부터 띄어쓰기가 처음 나올때까지 substring한다. (잘라서 넣는다)
            String tmp = str.substring(0, pos);
            // tmp의 길이가 m보다 크면
            // result에 tmp를 넣고, m의 값을 tmp의 length 로바꿔준다
            if (tmp.length() > m){
                result = tmp;
                m = tmp.length();
            }
            // 처음 str에서 잘라서 사용했기 때문에 그다음 조건문에서는 사용하지 않아도 됨으로 str을 바꿔준다.
            str = str.substring(pos + 1);
        }
        // 만약 마지막 단어의 길이가 m보다 크면 마지막 단어가 가장 긴 단어 임으로 result를 설정해준다.
        if (str.length() > m){
            result = str;
        }
        return result;
    }
}

public class String_3 {
    public static void main(String[] args) {
        // 한개의 문장이 주어지면 그 문장에서 가장 긴 단어를 출력하는 프로그램
        // 문장 속의 각 단어 사이에는 공백
        Main3 T = new Main3();
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "it is aaaaa time to study";
        System.out.println(T.solution1(str));
        System.out.println(T.solution2(str));
        System.out.println(T.solution3(str));
    }
}
