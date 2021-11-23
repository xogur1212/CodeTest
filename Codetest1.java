
import java.util.*;


class Solution{
	public String solution(String[] participant, String[] completion) {
		
		String answer ="";
		HashMap<String,Integer> hm =new HashMap<>();
		for(String player: participant) {
			hm.put(player, hm.getOrDefault(player, 0));
			
		}
		System.out.println(hm);
		for(String player: completion) {
			hm.put(player, hm.get(player)-1);
		}
		System.out.println(hm);
		for (String key : hm.keySet()) {
			if(hm.get(key)!=0) {
				answer=key;
			}
		}
		
		return answer;
		
	}
}

public class Codetest1 {

	public static void main(String[] args) {
		Solution s1=new Solution();
		String [] participant = {"abc","abc","bcd","ccc"};
		String [] completion = {"abc","bcd","abc"};
		System.out.println(s1.solution(participant, completion));
	}
}
