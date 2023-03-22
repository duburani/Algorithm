package programmers;

public class Pro003 {
    public static void main(String[] args) {
        Pro003 pro = new Pro003();
        System.out.println(pro.solution(4));
    }

    public long solution(int n) {
        long [] answer = new long[n+2];

        answer[0] = 0;
        answer[1] = 1;

        for(int i=2; i<=n+1; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer[n+1]%1234567;
    }
}
