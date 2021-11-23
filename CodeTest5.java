import java.util.*;
import java.util.Map.Entry;


class Solution5 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {1};
        
        HashMap <String,Integer> songList=new HashMap<>();
        
        for(int i=0;i<genres.length;i++) {
        	if(!songList.containsKey(genres[i]))
        	songList.put(genres[i],plays[i]);
        	else
        	songList.put(genres[i], songList.get(genres[i])+plays[i]);
        }
  
        Entry <String,Integer> maxEntry =null;
        Set<Entry<String, Integer>> entrySet=songList.entrySet();
        for(Entry<String,Integer> entry : entrySet) {
        	if(maxEntry==null || entry.getValue() >maxEntry.getValue()) {
        		maxEntry=entry;
        	}
        }
        System.out.println(maxEntry.getKey());
        
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(songList.entrySet());

		// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
        Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
			{
				// 내림 차순으로 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
        for(Entry<String, Integer> entry : list_entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
        
        return answer;
    }
    
}
public class CodeTest5 {
	public static void main(String[] args) {
	
		String []genres={"classic", "pop", "classic", "classic", "pop"};
		int []plays = {500, 600, 150, 800, 2500};
		
		Solution5 s5= new Solution5();
		s5.solution(genres, plays);
	}
}



