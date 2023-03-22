package programmers;

import java.util.HashMap;

public class Pro006 {
    public static void main(String[] args) {
//        int[] nums = {3,3,3,2,2,4};
        int[] nums = {3,3,3,2,2,2};

        Pro006 pro = new Pro006();
        System.out.println(pro.solution(nums));
    }

    public int solution(int[] nums) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
        System.out.println(map.size());

        answer = nums.length/2;
        if(answer > map.size())
            answer = map.size();


        return answer;
    }
}
