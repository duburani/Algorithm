package programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Pro004 {

    public static void main(String[] args) {
        Pro004 pro = new Pro004();
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(pro.solution(genres, plays));
    }
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> genrePlayNum = new HashMap<>();
        HashMap<String, Map<Integer, Integer>> genreMap = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            // genreMap에 값이 이미 담겨있는지 없는지 여부 체크

            Map<Integer, Integer> playMap = new HashMap<>();
            playMap.put(plays[i], i);
            genrePlayNum.put(genres[i], genrePlayNum.getOrDefault(genres[i],0) + plays[i]);

        }

        System.out.println("generePlayNum : " + genrePlayNum);
        System.out.println("genreMap : " + genreMap);



        return answer;
    }
}
