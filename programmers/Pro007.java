package programmers;

import java.util.Arrays;

public class Pro007 {
    public static void main(String[] args) {
        Pro007 pro = new Pro007();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(pro.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }

        return true;
    }
}
