package programmers;

import java.util.HashMap;
import java.util.Map;

public class Pro005 {
    public static void main(String[] args) {
        Pro005 solution = new Pro005();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution.solution(participant, completion));
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> participantMap = new HashMap<>();
        for(String par : participant){
            participantMap.put(par, participantMap.getOrDefault(par, 0) + 1);
        }

        for(String par : completion){
            participantMap.put(par, participantMap.get(par) - 1);
        }

        System.out.println(participantMap);



        return answer;
    }
}



/*

import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        int[] mara = new int[participant.length];

		Arrays.fill(mara, 1);


		for(int i=0; i<participant.length; i++) {
        	for(int j=0; j<completion.length; j++) {
        		if(participant[i].equals(completion[j])) {
        			mara[i]++;
        			completion[j] = "1";
        		}
        	}
        }

        for(int i=0; i<mara.length; i++) {
			if(mara[i] == 1) {
				answer = participant[i];
			}
		}


        return answer;
    }
}
 */