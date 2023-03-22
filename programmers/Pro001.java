package programmers;

public class Pro001 {
    public static void main(String[] args) {
        Pro001 pro = new Pro001();
        System.out.println(pro.solution(5000));
    }

    public int solution(int n) {
        int ans = 0;

        while(n >= 0){
            if(n==0) break;

            if(n % 2 == 0){
                n /= 2;
            }else {
                n -= 1;
                ans++;
            }
        }

        return ans;
    }
}
