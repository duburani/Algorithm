package programmers;

import java.util.Arrays;

public class Pro002 {
    public static void main(String[] args) {
        Pro002 pro = new Pro002();
        int[] arr = {2,6,8,14};
        System.out.println(pro.solution(arr));
    }

    public int solution(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int lcm = arr[0];
        for (int i = 1; i < length; i++) {
            int gcd = getGCD(lcm, arr[i]);
            lcm = lcm * arr[i] / gcd;
        }
        return lcm;
    }

    public int getGCD(int num1, int num2) {
        if (num1 < num2) {
            int num = num1;
            num1 = num2;
            num2 = num;
        }

        if (num1 % num2 == 0) {
            return num2;
        } else {
            return getGCD(num2, num1 % num2);
        }
    }
}
