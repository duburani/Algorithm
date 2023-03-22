package programmers;

import java.util.HashMap;

public class Pro008 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Pro008 pro = new Pro008();
        System.out.println(pro.solution(clothes));
    }
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> cloMap = new HashMap<>();
        for(String[] clo : clothes){
            cloMap.put(clo[1], cloMap.getOrDefault(clo[1],0) + 1);
        }

        for (Integer value : cloMap.values()) {
            answer *= value + 1;
        }

        return answer-1;
    }
}
